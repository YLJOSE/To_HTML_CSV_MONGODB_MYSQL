package Reto1.CsvGestor;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorCSV {
// ruta, tuve problemas al poner la ruta relativa como te comenté hace dias
    protected String path = "words.csv";

    public GestorCSV() {

    }

    public List<String> leerCSV() {
        List<String> lineArray = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // dividr la línea por las comas y almacenamos las palabras
                String[] palabrasLinea = linea.split(",");
                // Add las palabras
                lineArray.addAll(Arrays.asList(palabrasLinea));
            }
            return lineArray;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
