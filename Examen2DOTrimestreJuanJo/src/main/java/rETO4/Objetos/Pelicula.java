package rETO4.Objetos;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "director")
    private String director;

   @ManyToMany
    private Set<Persona> reparto;
    @Column(name = "favorita")
    private boolean favorita;

    public Pelicula() {

    }

    public Pelicula(String titulo, String director, boolean favorita) {
        this.titulo = titulo;
        this.director = director;
        this.favorita = favorita;
    }

    public Pelicula(String titulo, String director, Set<Persona> reparto, boolean favorita) {
        this.titulo = titulo;
        this.director = director;
        this.reparto = reparto;
        this.favorita = favorita;
    }

    public Set<Persona> getReparto() {
        return reparto;
    }

    public void setReparto(Set<Persona> reparto) {
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
                ", favorita=" + favorita +
                '}';
    }

}
