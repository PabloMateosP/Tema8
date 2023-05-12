package Ejercicios_Diapositiva.Ejercicio_9;

import java.sql.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3360/tienda";
        try {
            Connection cn = DriverManager.getConnection(url, "pablo", "Tokito1301");
            Statement stn = cn.createStatement();
            ResultSet rs = stn.executeQuery("SELECT * FROM productos ORDER BY precios DESC");
            //Usaremos el executeQuery ya que queremos leer de la base da datos
            while (rs.next()){
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
                System.out.println("Precio: " + rs.getInt("precio"));
                System.out.println("País: " + rs.getString("pais"));
            }

            stn.close();
            cn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
