package org.HASHMAPEJEMPLOREVISAR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HASHMAPEJEMPLO {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();

        palabras.add("dos");
        palabras.add("dos");
        palabras.add("tres");
        palabras.add("tres");
        palabras.add("tres");
        palabras.add("tres");
        palabras.add("tres");
        palabras.add("tres");
        palabras.add("tres");
        palabras.add("cuatro");
        palabras.add("cuatro");
        palabras.add("uno");
        palabras.add("uno");
        palabras.add("uno");

        HashMap<String, Integer> conteoPalabras = new HashMap<>();


        for (String palabra : palabras) {
            // Si el string ya está en el mapa, incrementamos el valor +1
            conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
        }

        // Imprimir el hashmap
        for (String key : conteoPalabras.keySet()) {
            System.out.println(key + " se repite " + conteoPalabras.get(key) + " veces.");
        }
    }
}