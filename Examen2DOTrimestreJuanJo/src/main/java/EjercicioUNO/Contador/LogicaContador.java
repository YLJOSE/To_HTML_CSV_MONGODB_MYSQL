package EjercicioUNO.Contador;

import java.util.HashMap;
import java.util.List;

public class LogicaContador {
    public static HashMap<String, Integer> contar(List<String> palabras) {

        HashMap<String, Integer> palabrasContadas = new HashMap<>();

        for (String pala : palabras) {
            palabrasContadas.put(pala,palabrasContadas.getOrDefault(pala,0) +1);
        }
        return palabrasContadas;

    }
}
