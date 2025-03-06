package Reto1;

import java.util.HashMap;
import java.util.List;

public class PreparadorDeDatos {
    public static HashMap<String, Integer> datosAHTML(List<String> palabras){
        HashMap<String, Integer> conteoPalabras = new HashMap<>();

        for (String palabra : palabras) {
            // Si el string ya está en el mapa, incrementamos el valor +1
            conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
        }
        return conteoPalabras;
    }
}
