package rETO4;

import Utils.HibernateUtil;
import jakarta.transaction.SystemException;
import rETO4.DAO.DAOPelicula;
import rETO4.DAO.DAOPersona;
import rETO4.Objetos.Pelicula;
import rETO4.Objetos.Persona;

import java.util.HashSet;
import java.util.Set;

public class pruebas {
    public static void main(String[] args) {
        DAOPelicula cartDAO = new DAOPelicula();
        DAOPersona itemDAO = new DAOPersona();

        Persona item = new Persona("pedro", "perez");
        Persona item2 = new Persona("carlos", "perez");


        Set<Persona> items = new HashSet<>();
        items.add(item);
        items.add(item2);

        Pelicula cart1 = new Pelicula("nueva pelicula", "yo", true);

        cart1.setReparto(items);

        try {
            itemDAO.saveCart(item);
            itemDAO.saveCart(item2);
            cartDAO.saveCart(cart1);

        } catch (SystemException e) {
            throw new RuntimeException(e);
        }

        // Shut down the SessionFactory
        HibernateUtil.shutdown();
    }
}
