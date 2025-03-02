package Reto3;

import Reto3.BBDDCRUD.CRUDUsuario;
import Reto3.Interfaces.CRUD;
import Reto3.MongoDBManager.MongoDBGestor;
import Reto3.Objetos.Pelicula;
import Reto3.Objetos.Persona;

import java.util.ArrayList;
import java.util.List;

public class prueba {
    public static void main(String[] args) {
        CRUD<Pelicula> mongoRepo = new MongoDBGestor();
        CRUDUsuario CRUDUsuario = new CRUDUsuario(mongoRepo);

        List<Persona> people = new ArrayList<>();
        people.add(new Persona("pedro", "rod"));
        people.add(new Persona("carlos", "tre"));

        // Insertar un usuario
        //  CRUDUsuario.annadir(new Pelicula("las mil y una noches","yo",people,true));
        List<Pelicula> pelicas = CRUDUsuario.obtenerTodosLosObjetos();

        pelicas.forEach(System.out::println);
    }
}
