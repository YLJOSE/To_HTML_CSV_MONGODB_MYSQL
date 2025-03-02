package Reto2;

import Reto2.GestorCSV.CSVGestor;
import Reto2.GestorDeBaseDeDatos.MysQLDBGestor;

public class pruebas {
    public static void main(String[] args) {
        //SoporteBinario.escribirCredenciales();

        MysQLDBGestor gestorSQL = new MysQLDBGestor();


       CSVGestor  gestorCSV= new CSVGestor(gestorSQL.obtenerDatos());
//
      gestorCSV.escribirCSV();

    }
}
