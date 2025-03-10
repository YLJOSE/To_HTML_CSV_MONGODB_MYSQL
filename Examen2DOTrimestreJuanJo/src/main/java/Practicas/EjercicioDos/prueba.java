package Practicas.EjercicioDos;

import Practicas.EjercicioDos.GestorFichero.GestorFicheros;

public class prueba {
    public static void main(String[] args) {
        GestorFicheros gestor = new GestorFicheros("archivocopia.txt","Ejercicios");
        gestor.copiarFichero();
    }
}
