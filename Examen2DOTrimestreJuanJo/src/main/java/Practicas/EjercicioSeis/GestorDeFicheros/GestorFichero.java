package Practicas.EjercicioSeis.GestorDeFicheros;

import Practicas.EjercicioSeis.Objetos.Persona;

import java.io.*;

public class GestorFichero {
    private String ruta;

    public GestorFichero(String ruta) {
        this.ruta = ruta;

    }

    public void escribirObjeto(Persona persona) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.ruta))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void leerFichero() {
        Persona persona;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.ruta))) {
             persona = (Persona) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(persona);
    }
}
