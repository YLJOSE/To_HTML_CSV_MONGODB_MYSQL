package Reto2.GestorCSV;

import Reto2.Objetos.Departamentos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVGestor {

    private String ruta = "departamentos.csv";
    private List<Departamentos> departamentosList = new ArrayList<>();

    public CSVGestor(List<Departamentos> departamentosList) {
        this.departamentosList = departamentosList;
    }

    public void escribirCSV() {

        try (FileWriter ficheroEscritura = new FileWriter(ruta,true)) {

            for (int i = 0; i < departamentosList.size(); i++) {
                int contador = 0;
                for (int j = 0; j < departamentosList.size(); j++) {
                    if (departamentosList.get(i).getUbicacionID() == departamentosList.get(j).getUbicacionID()) {
                        contador++;

                    }
                }
                System.out.println(contador);
                ficheroEscritura.append(departamentosList.get(i).getUbicacionID());
                ficheroEscritura.append(String.valueOf(contador));
                ficheroEscritura.append("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
