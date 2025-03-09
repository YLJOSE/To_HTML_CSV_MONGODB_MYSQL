package EjercicioUNO;

import EjercicioUNO.CSVGestor.GestorCSV;
import EjercicioUNO.Contador.LogicaContador;
import EjercicioUNO.HTMLGestor.GestorHTML;

import java.util.HashMap;
import java.util.List;

public class prueba {
    public static void main(String[] args) {
        GestorCSV gestor = new GestorCSV();

//        String respuesta = crearFichero()? "El fichero se creo correctamente":"No se creo el fichero";
//        System.out.println(respuesta);
        List<String> pala = gestor.leerCSV();



        HashMap<String,Integer> palabrasContadas =LogicaContador.contar(pala) ;

      //  palabrasContadas.forEach((s, integer) -> System.out.println(s + " se repite: " + integer + " veces."));
        GestorHTML.escribirParaHTML(palabrasContadas);
    }
}
