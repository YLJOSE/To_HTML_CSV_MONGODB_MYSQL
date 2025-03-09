package EjercicioUNO.CSVGestor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorCSV {
    protected String ruta = "texto.csv";

    public GestorCSV() {

    }

    public boolean crearFichero() {
        String path = "texto.csv";

        File d = new File(path);

        if (!d.exists()) {

            try {
                d.createNewFile();
                return true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public  List<String> leerCSV() {

        String linea;

        try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {

            linea = bf.readLine();
            List<String> listaPalabras = new ArrayList<>();

            while (linea != null) {

                String[] array = linea.split(",");


                listaPalabras.addAll(Arrays.asList(array));

                linea = bf.readLine();

            }
            return listaPalabras;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
