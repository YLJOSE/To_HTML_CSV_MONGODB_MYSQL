package Practicas.EjercicioSeis.Objetos;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona:\n" + nombre + "\n" + apellidos + "\n" + edad;
    }
}
