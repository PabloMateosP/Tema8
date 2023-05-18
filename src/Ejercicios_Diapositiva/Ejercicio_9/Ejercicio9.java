package Ejercicios_Diapositiva.Ejercicio_9;

import java.sql.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        //Las primeras veces daba fallo, ya que, había puesto 3360 en vez de 3306.

        try {
            Connection cn = DriverManager.getConnection(url, "root", "");
            //Creamos la conexión mediante la url el usuario en este caso root y la contraseña.
            Statement stn = cn.createStatement();
            //Creamos el objeto de tipo Statement para enviar consultas a la base de datos
            ResultSet rs = stn.executeQuery("SELECT * FROM productos ORDER BY precio DESC");
            //Ejecutamos la orden de mostrar las frutas en orden descendente.
            //Usaremos el executeQuery, ya que queremos leer de la base da datos
            while (rs.next()){
                //Iteramos sobre los resultados hasta que no haya más datos
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
                System.out.println("Precio: " + rs.getInt("precio"));
                System.out.println("País: " + rs.getString("pais"));
            }
            //Cerramos el objeto de tipo statement y la conexión.
            stn.close();
            cn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
