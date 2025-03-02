package Reto3.Objetos;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import java.util.List;

public class Pelicula {

    private String titulo;
    private String director;


    private List<Persona> reparto;
    private boolean favorita;


    public Pelicula(String titulo, String director, List<Persona> reparto, boolean favorita) {
        this.titulo = titulo;
        this.director = director;
        this.reparto = reparto;
        this.favorita = favorita;
    }

    public List<Persona> getReparto() {
        return reparto;
    }

    public void setReparto(List<Persona> reparto) {
        this.reparto = reparto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", reparto=" + reparto +
                ", favorita=" + favorita +
                '}';
    }
}
