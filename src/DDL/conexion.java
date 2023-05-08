package DDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3360/tienda"; //Cuando se tenga la base de datos creada
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement stn = con.createStatement();
            stn.close();
            con.close();


        } catch (SQLException t ){
            t.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
