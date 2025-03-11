package Practicas.EjercicioCinco.GestorFichero;

import java.io.*;
import java.util.*;

public class GestorFicheroCinco {
    private String rutaPrincipal;
    private String rutaFinal;

    public GestorFicheroCinco(String ruta1, String ruta2) {
        this.rutaPrincipal = ruta1;
        this.rutaFinal = ruta2;
    }

    public void ordenarFichero() {
        List<String> lineas = leerFichero();
        //  lineas.forEach(System.out::println);
        escribirFicheroNuevo(lineas);


    }

    private List<String> leerFichero() {
        List<String> lineasOrdenadas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(this.rutaPrincipal))) {
            String linea = br.readLine();

            while (linea != null) {
                lineasOrdenadas.add(linea);

                linea = br.readLine();
            }
            Collections.sort(lineasOrdenadas);
            return lineasOrdenadas;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void escribirFicheroNuevo(List<String> lineas) {
        try (FileWriter fw = new FileWriter(this.rutaFinal)) {
            for (String linea : lineas)
                fw.append(linea).append("\n");
            System.out.println("FIN!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
