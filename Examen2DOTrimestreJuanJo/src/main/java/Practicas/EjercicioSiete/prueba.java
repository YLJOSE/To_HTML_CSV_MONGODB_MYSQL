package Practicas.EjercicioSiete;

import Practicas.EjercicioSiete.GestorFicheros.GestorFichero;

public class prueba {
    public static void main(String[] args) {
        GestorFichero gestor = new GestorFichero("diamante.png","nuevo_diamante.png");
        gestor.copiar();
       // gestor.comparar();
    }
}
