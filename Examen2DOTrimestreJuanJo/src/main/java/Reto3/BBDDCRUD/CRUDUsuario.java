package Reto3.BBDDCRUD;

import Reto3.Interfaces.CRUD;
import Reto3.Objetos.Pelicula;

import java.util.List;

public class CRUDUsuario {
    private final CRUD<Pelicula> usuarioBBDD;

    public CRUDUsuario(CRUD<Pelicula> usuarioBBDD) {
        this.usuarioBBDD = usuarioBBDD;
    }

    public void annadir(Pelicula pelicula) {
        usuarioBBDD.insertarUsuario(pelicula);

    }

    public List<Pelicula> obtenerTodosLosObjetos() {

        return usuarioBBDD.obtenerTodosLosDocumentos();

    }
}
