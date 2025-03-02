package Reto3.Interfaces;

import java.util.List;

public interface CRUD<T>{
    void insertarUsuario(T entity);
    List<T> obtenerTodosLosDocumentos();
}
