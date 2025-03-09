package EjercicioDos.GestorMYSQL;

import EjercicioDos.GestorBinario.BinarioGestorMYSQL;
import EjercicioDos.GestorBinario.CredencialesMYSQL;
import EjercicioDos.Interfaz.CRUD;

import java.sql.*;
import java.util.List;

public class MYSQLGestor {

    private Connection connection;
    private CRUD<String> crud;

    public MYSQLGestor() {
        BinarioGestorMYSQL binario =new BinarioGestorMYSQL();
        CredencialesMYSQL credencialesMYSQL = binario.leerCredenciales() ;
        try {
            connection = DriverManager.getConnection(credencialesMYSQL.toString(), credencialesMYSQL.getUsuario(), credencialesMYSQL.getContrasenna());
            System.out.println("coneccion correcta!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
         /*
        * usuario=root
        password=
        Url=jdbc:mysql://localhost:3307/Administracion
        * */
//        CredencialesMYSQL credencialesMYSQL = new CredencialesMYSQL(
//                "jdbc:mysql://localhost:3306/",
//                "departments",
//                "","root",
//                "admin");
//        BinarioGestorMYSQL binario =new BinarioGestorMYSQL();
//        binario.escribirCredenciales(credencialesMYSQL);
        MYSQLGestor mysqlGestor = new MYSQLGestor();
        mysqlGestor.crear();
    }

    public void crear() {
        String consulta = """
                select location_id,count(*) as conteo from departments group by location_id;
                """;
        try {
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("-----");
            while (rs.next()) {
                int i = rs.getInt("location_id");
                int y = rs.getInt("conteo");
                System.out.println(i + " : " + y);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> leerTodo() {
        return crud.leerTodo();
    }
}
