package Reto2.GestorBinario;

import java.io.*;

public class SoporteBinario {
    public static Credenciales leerCredenciales() {

        File file = new File("credencialesMySqL.dat");
        Credenciales credentials;

        try {
            ObjectInputStream oIs = new ObjectInputStream(new FileInputStream(file));

            credentials = (Credenciales) oIs.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return credentials;
    }

    public static void escribirCredenciales() {

        File file = new File("credencialesMySqL.dat");
        /*
        * usuario=root
        password=
        Url=jdbc:mysql://localhost:3307/Administracion
        * */

        Credenciales credenciales = new Credenciales(
                "jdbc:mysql://localhost:",
                "3307",
                "root",
                "",
                "DAM2");

        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))){
            ous.writeObject(credenciales);
            System.out.println("Listo!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
