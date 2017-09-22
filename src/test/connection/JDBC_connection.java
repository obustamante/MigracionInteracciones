package test.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC_connection {

    public static void main(String[] argv) {

        final String JDBC = "postgresql";
        final String HOSTNAME = "127.0.0.1";
        final String PORT = "5432";
        final String DB_NAME = "test001";
        final String USER_NAME = "interacciones";
        final String PASSWORD = "123456";

        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("¿Dónde está su controlador PostgreSQL JDBC? "
                    + "¡Incluya en el directorio de libreia!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver encontrado!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:" + JDBC + "://" + HOSTNAME + ":" + PORT + "/" + DB_NAME, USER_NAME, PASSWORD);

        } catch (SQLException e) {

            System.out.println("¡La conexión falló! Comprobar la consola de salida");
            e.printStackTrace();
            return;

        }


        if (connection != null) {
            System.out.println("Lo hiciste, tienes el control de la base de datos ahora!");
        } else {
            System.out.println("Error al realizar la conexión!");
        }
    }

}
