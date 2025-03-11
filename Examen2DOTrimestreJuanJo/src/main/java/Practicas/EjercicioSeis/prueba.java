package Practicas.EjercicioSeis;

import Practicas.EjercicioSeis.GestorDeFicheros.GestorFichero;
import Practicas.EjercicioSeis.Objetos.Persona;

public class prueba {
    public static void main(String[] args) {
        Persona persona = new Persona("pedro", "perez", 20);
        GestorFichero gestor = new GestorFichero("ficheroBinario.dat");
        gestor.escribirObjeto(persona);
        gestor.leerFichero();
    }
}
