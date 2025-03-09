package EjercicioDos.GestorBinario;

import java.io.*;

public class BinarioGestorMYSQL {
    public boolean escribirCredenciales(CredencialesMYSQL credencialesMYSQL) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MYSQLCredenciales.dat"))) {

            oos.writeObject(credencialesMYSQL);
            System.out.println("correcto!!");
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public CredencialesMYSQL leerCredenciales() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MYSQLCredenciales.dat"))) {

            CredencialesMYSQL credenciales = (CredencialesMYSQL) ois.readObject();
            return credenciales;

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
