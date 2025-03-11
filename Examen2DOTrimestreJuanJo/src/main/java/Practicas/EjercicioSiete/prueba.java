package Practicas.EjercicioSiete;

import Practicas.EjercicioSiete.GestorFicheros.GestorFichero;

public class prueba {
    public static void main(String[] args) {
        GestorFichero gestor = new GestorFichero("archivocopia.txt","archivoOrdenado.txt");
//        gestor.copiar();
        gestor.comparar();
    }
}
