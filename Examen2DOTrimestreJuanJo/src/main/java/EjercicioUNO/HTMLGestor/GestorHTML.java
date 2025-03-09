package EjercicioUNO.HTMLGestor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class GestorHTML {

    public static void escribirParaHTML(HashMap<String, Integer> palabrasContadas) {
        StringBuilder sb = new StringBuilder();

        sb.append("<table>");
        sb.append("<td>").append("palabra").append("</td>").append("<td>").append("cantidad").append("</td>");


        for (String key : palabrasContadas.keySet()) {

            sb.append("<tr>");

            sb.append("<td>").append(key).append("</td>").append("<td>").append(palabrasContadas.get(key)).append("</td>");

        }


        sb.append("</table>");

        escribirAFichero(sb.toString());

    }

    public static void escribirAFichero(String contenido) {

        try (FileWriter fichero = new FileWriter("palabrasContadas.html")) {

            fichero.write("<html>");
            fichero.write(contenido);
            fichero.write("</html>");
            System.out.println("Fichero escrito correctamente!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
