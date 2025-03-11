package Practicas.EjercicioCinco;

import Practicas.EjercicioCinco.GestorFichero.GestorFicheroCinco;

public class prueba {
    public static void main(String[] args) {
        GestorFicheroCinco gestor = new GestorFicheroCinco("archivocopia.txt","archivoOrdenado.txt");
        gestor.ordenarFichero();
    }
}
