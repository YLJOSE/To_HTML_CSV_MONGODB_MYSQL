package Reto1;

import Reto1.CsvGestor.GestorCSV;
import Reto1.GestorHTML.HTMLGestor;

import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        GestorCSV gestor = new GestorCSV();
        List<String> listaPalabras = gestor.leerCSV();

        HTMLGestor.generarTablaHTML(PreparadorDeDatos.datosAHTML(listaPalabras));

    }
}
