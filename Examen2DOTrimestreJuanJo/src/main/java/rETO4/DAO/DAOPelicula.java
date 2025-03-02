package rETO4.DAO;

import Utils.HibernateUtil;
import jakarta.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rETO4.Objetos.Pelicula;

import java.util.List;

public class DAOPelicula {
    public boolean saveCart(Pelicula cart) throws SystemException {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(cart);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();

            }
            return false;
        }
    }

    public boolean updateCart(Pelicula cart) throws SystemException {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.merge(cart);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return false;
        }
    }

    public Pelicula getCartById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Pelicula.class, id);
        }
    }

    public List<Pelicula> getAllCarts() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Pelicula", Pelicula.class).list();
        }
    }

    public boolean deleteCart(int id) throws SystemException {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Pelicula student = getCartById(id);
            if (student != null) {
                session.remove(student);
                System.out.println("Student is deleted");
            }
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return false;
        }
    }
}
