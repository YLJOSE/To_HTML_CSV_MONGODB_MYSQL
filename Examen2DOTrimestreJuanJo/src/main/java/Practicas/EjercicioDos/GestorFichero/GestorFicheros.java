package Practicas.EjercicioDos.GestorFichero;


import java.io.*;

public class GestorFicheros {
    private String rutaEntrada;
    private String rutaFinal;

    public GestorFicheros(String rutaFinal, String rutaPrincipal) {
        this.rutaEntrada = rutaPrincipal;
        this.rutaFinal = rutaFinal;
    }

    public void copiarFichero() {
        StringBuilder sb;
        sb = leerFichero();
        escribirFichero(sb);


    }

    public StringBuilder leerFichero() {
        String linea;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(this.rutaEntrada))) {
            linea = br.readLine();
            while (linea != null) {
                sb.append(linea);
                linea = br.readLine();
                sb.append("\n");
            }
            return sb;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void escribirFichero(StringBuilder texto) {
        try (FileWriter fw = new FileWriter(this.rutaFinal)) {
            fw.append("Fichero Copia===JuanJo");
            fw.append(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**/
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(this.rutaFinal))) {
            linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
