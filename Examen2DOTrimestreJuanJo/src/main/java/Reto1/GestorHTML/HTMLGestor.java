package Reto1.GestorHTML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HTMLGestor {

    public static void generarTablaHTML(List<String> palabras) {

        StringBuilder sb = new StringBuilder();

        // Crear la tabla HTML
        sb.append("<table border='1'>");
        sb.append("<tr><th>Palabra</th><th>Nº veces que aparece</th></tr>");
        for (int i = 0; i < palabras.size(); i++) {
            int contador = 0;
            sb.append("<tr>");
            sb.append("<td>").append(palabras.get(i)).append("</td>");
            for (int j = 0; j < palabras.size(); j++) {

                if (palabras.get(i).equalsIgnoreCase(palabras.get(j))) {
                    contador++;
                }
            }
            sb.append("<td>").append(contador).append("</td>");

        }

        // Cerrar la tabla
        sb.append("</table>");

        //return sb.toString();
        guardarEnArchivoHTML(sb.toString());
    }

    public static void guardarEnArchivoHTML(String htmlContent) {
        String filePath = "personas.html";

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
