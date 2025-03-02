package Reto1.CsvGestor;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GestorCSV {
// ruta, tuve problemas al poner la ruta relativa como te comenté hace dias
    protected String path = "Reto1/words.csv";

    public GestorCSV() {

    }

    public List<String> leerCSV() {

        String lineaLeida;
        List<String> lineArray = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            lineaLeida = bufferedReader.readLine();

            while (lineaLeida != null) {
                for (String pala : lineaLeida.split(",")) {

                    lineArray.add(pala);
                }
                lineaLeida = bufferedReader.readLine();
            }
            return lineArray;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
