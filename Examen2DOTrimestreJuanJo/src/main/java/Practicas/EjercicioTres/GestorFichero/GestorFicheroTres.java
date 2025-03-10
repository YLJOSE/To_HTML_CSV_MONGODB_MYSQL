package Practicas.EjercicioTres.GestorFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicheroTres {
    private String ruta;

    public GestorFicheroTres(String ruta) {
        this.ruta = ruta;
    }

    public void contarPalabrasLineas() {
        String linea;
        int contadorPalabras = 0;
        int contadorLineas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            linea = br.readLine();
            while (linea != null) {
                contadorLineas++;
                String[] array = linea.split(" ");
                contadorPalabras += array.length;
                linea = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hay " + contadorPalabras + " palabras y " + contadorLineas + " lineas.");

    }
}
