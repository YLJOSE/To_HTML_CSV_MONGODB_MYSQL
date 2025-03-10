package Practicas.EjercicioCuatro.GestorFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GestorFicheroCuatro {
    private String ruta;

    public GestorFicheroCuatro(String ruta) {
        this.ruta = ruta;
    }

    public void reemplazarPalabra(String palabraBuscar, String palabraReemplazar) {
        leer(palabraBuscar, palabraReemplazar);

    }


    public void leer(String buscar, String remp) {
        String linea;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(this.ruta))) {
            linea = br.readLine();

            while (linea != null) {

               String nueva = Arrays.toString(linea.split(" ")).replaceAll(buscar,remp);


                sb.append(nueva);
                linea = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }

    public void escribir(String palabra) {

    }
}
