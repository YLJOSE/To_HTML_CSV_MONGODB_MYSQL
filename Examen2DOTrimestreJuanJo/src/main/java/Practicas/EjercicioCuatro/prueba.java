package Practicas.EjercicioCuatro;

import Practicas.EjercicioCuatro.GestorFichero.GestorFicheroCuatro;

public class prueba {
    public static void main(String[] args) {
        GestorFicheroCuatro gestor = new GestorFicheroCuatro("archivocopia.txt");
        gestor.reemplazarPalabra("Lectura","Leer");
    }
}
