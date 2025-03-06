package Reto1.GestorHTML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class HTMLGestor {

    public static void generarTablaHTML( HashMap<String,Integer> conteoPalabras) {

        StringBuilder sb = new StringBuilder();

        // Crear la tabla HTML
        sb.append("<table border='1'>");
        sb.append("<tr><th>Palabra</th><th>Nº veces que aparece</th></tr>");
        for (String key : conteoPalabras.keySet()) {
            sb.append("<tr>");
            sb.append("<td>").append(key).append("</td>");
            sb.append("<td>").append(conteoPalabras.get(key)).append("</td>");

        }

        // Cerrar la tabla
        sb.append("</table>");

        //return sb.toString();
        guardarEnArchivoHTML(sb.toString());
    }

    public static void guardarEnArchivoHTML(String htmlContent) {
        String filePath = "palabras.html";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Escribir el contenido HTML en el archivo
            writer.write("<html><body>");
            writer.write(htmlContent);
            writer.write("</body></html>");
            System.out.println("Archivo HTML guardado como: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
