package EjercicioDos.Interfaz;

import java.util.List;

public interface CRUD<T>{
    void crear(T entidad);
    List<T> leerTodo();

}
