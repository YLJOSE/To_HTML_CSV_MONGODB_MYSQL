package Practicas.EjercicioUno.GestorFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFichero {
    private String ruta;

    public GestorFichero(String ruta) {
        this.ruta = ruta;
    }

    public void leerFichero() {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            System.out.println("------------");
            linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

            System.out.println(linea);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
