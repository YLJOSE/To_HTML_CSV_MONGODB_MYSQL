package Reto3.MongoDBManager;

import Reto3.GestorBinario.BinaryHelper;
import Reto3.GestorBinario.Credentials;
import Reto3.Interfaces.CRUD;
import Reto3.Objetos.Pelicula;
import Reto3.Objetos.Persona;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MongoDBGestor implements CRUD<Pelicula> {
    private final MongoCollection<Document> mongoColeccion;

    public MongoDBGestor() {
        Credentials credentials = BinaryHelper.readCredentials();
        MongoClient mongoClient = MongoClients.create(credentials.getRuta()); //"mongodb://localhost:27017");

        MongoDatabase database = mongoClient.getDatabase(credentials.getBbddNombre());
        this.mongoColeccion = database.getCollection(credentials.getNombreColeccion());
    }

    @Override
    public void insertarUsuario(Pelicula entity) {
        Document doc = new Document("titulo", entity.getTitulo())
                .append("director", entity.getDirector()).
                append("reparto", Arrays.asList(new Document("nombre", entity.getReparto().get(0).getNombre()).append("Apellido", entity.getReparto().get(0).getApellido()),
                        new Document("nombre", entity.getReparto().get(1).getNombre()).append("Apellido", entity.getReparto().get(1).getApellido()))).
                append("favorito", entity.isFavorita());

        mongoColeccion.insertOne(doc);
    }

    @Override
    public List<Pelicula> obtenerTodosLosDocumentos() {
        List<Pelicula> usuarios = new ArrayList<>();
        for (Document doc : mongoColeccion.find()) {
            List<Document> personas = (List<Document>) doc.get("reparto");
            List<Persona> listaPersonas = new ArrayList<>();
            for (Document docSub : personas) {
                listaPersonas.add(new Persona(docSub.getString("nombre"),docSub.getString("Apellido")));
            }
            Pelicula pelicula = new Pelicula(
                    doc.getString("titulo"),
                    doc.getString("director"),listaPersonas,
                    doc.getBoolean("favorito"));
            usuarios.add(pelicula);
        }
        return usuarios;
    }
}
