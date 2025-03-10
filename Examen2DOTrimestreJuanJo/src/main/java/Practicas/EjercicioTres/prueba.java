package Practicas.EjercicioTres;

import Practicas.EjercicioTres.GestorFichero.GestorFicheroTres;

public class prueba {

    public static void main(String[] args) {
        GestorFicheroTres gestor = new GestorFicheroTres("archivocopia.txt");
        gestor.contarPalabrasLineas();
    }
}
