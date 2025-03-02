package Reto3.GestorBinario;

import java.io.*;

public class BinaryHelper {

    public static Credentials readCredentials() {

        File file = new File("credencialesMongo.dat");
        Credentials credentials;

        try {
            ObjectInputStream oIs = new ObjectInputStream(new FileInputStream(file));

            credentials = (Credentials) oIs.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return credentials;
    }

//    public static void main(String[] args) {
//        escribirCredenciales();
//    }
    public static void escribirCredenciales() {

        File file = new File("credencialesMongo.dat");
        /*
        * usuario=root
        password=
        Url=jdbc:mysql://localhost:3307/Administracion
        * */

        Credentials credenciales = new Credentials(
               "mongodb://localhost:27017/","local","Cine");

        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))){
            ous.writeObject(credenciales);
            System.out.println("Listo!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
