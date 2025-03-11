package Practicas.EjercicioSiete.GestorFicheros;

import java.io.*;
import java.util.Arrays;

public class GestorFichero {
    private String rutaPrincipal;
    private String rutaFinal;

    public GestorFichero(String rutaPrincipal, String rutaFinal) {
        this.rutaPrincipal = rutaPrincipal;
        this.rutaFinal = rutaFinal;
    }

    public void copiar() {
        leerYCopiar();
        System.out.println("yaaaaaa");

    }

    private void leerYCopiar() {
        try {
            File file = new File(this.rutaPrincipal);
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(this.rutaFinal));

            byte[] array;

            array = dis.readAllBytes();

            dos.write(array);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void comparar() {
        try {

            DataInputStream dis = new DataInputStream(new FileInputStream(this.rutaPrincipal));
            DataInputStream dos = new DataInputStream(new FileInputStream(this.rutaFinal));

            byte[] array = dis.readAllBytes();
            byte[] arrayDos = dos.readAllBytes();

            if(Arrays.equals(array, arrayDos)){
                System.out.println("son iguales");
            }else{
                System.out.println("no son iguales");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
