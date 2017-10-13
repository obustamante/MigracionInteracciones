package co.edu.usc.vision.interacciones.api.utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdUtils {

    static Connection c = null;

    public static Connection getSession() {

        try {

            if (c == null) {

                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/test001", "interacciones", "123456");
                //System.out.println("Base de datos abierta correctamente");

                c.setAutoCommit(false);
                //System.out.println("AutoCommit(false)");

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


        return c;
    }

    public static void closeSession() throws SQLException {
        if(c != null){
            c.close();
            c = null;
            //System.out.println("Base de datos cerrada correctamente \n\r");
        }
    }

}
