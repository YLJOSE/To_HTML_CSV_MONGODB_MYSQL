package Reto2.Objetos;

public class Departamentos {
    private int id;
    private String nombre;
    private int ubicacionID;

    public Departamentos(int id, String nombre, int ubicacionID) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacionID = ubicacionID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacionID() {
        return String.valueOf(ubicacionID);
    }

    public void setUbicacionID(int ubicacionID) {
        this.ubicacionID = ubicacionID;
    }

    @Override
    public String toString() {
        return "Departamentos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ubicacionID=" + ubicacionID +
                '}';
    }
}
