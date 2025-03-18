package Practicas.EjercicioCuatro.GestorFichero;

import java.io.*;
import java.util.Arrays;

public class GestorFicheroCuatro {
    private String ruta;

    public GestorFicheroCuatro(String ruta) {
        this.ruta = ruta;
    }

    public void reemplazarPalabra(String palabraBuscar, String palabraReemplazar) {

        StringBuilder sb = leer(palabraBuscar, palabraReemplazar);
        escribir(sb);

    }


    private StringBuilder leer(String buscar, String remp) {
        String linea;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            linea = br.readLine();

            while (linea != null) {

                String a = (Arrays.toString(linea.split(" ")).replaceAll(buscar, remp));
                sb.append(a.replace("[", "").replace("]", "").replace(",", ""));
                linea = br.readLine();
            }
            System.out.println(sb);
            return sb;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void escribir(StringBuilder sb) {
        try (FileWriter fw = new FileWriter(this.ruta)) {
            fw.write(String.valueOf(sb));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
