package Reto2.GestorDeBaseDeDatos;

import Reto2.GestorBinario.Credenciales;
import Reto2.GestorBinario.SoporteBinario;
import Reto2.Objetos.Departamentos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysQLDBGestor {
    protected Connection connection;

    public MysQLDBGestor() {

        try {
            Credenciales credenciales = SoporteBinario.leerCredenciales();
            connection = DriverManager.getConnection(credenciales.toString(),credenciales.getUsuario(), credenciales.getContrasenna());
            if (connection != null) {
                System.out.println("INFO.conectado exitosamente a MYSQL DB");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<Departamentos> obtenerDatos() {
        String consulta = "select * from departments;";
        List<Departamentos> departamentosList = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(consulta)) {

            ResultSet rst = stmt.executeQuery();

            while (rst.next()) {
                Departamentos personaFiltro = new Departamentos(
                        rst.getInt("department_id"),
                        rst.getString("department_name"),
                        rst.getInt("location_id"));

                departamentosList.add(personaFiltro);
            }

            rst.close();
            return departamentosList;

        } catch (SQLException e) {
            e.getErrorCode();
        }
        return null;

    }


}
