package co.edu.usc.vision.interacciones.api.fileRider;

import co.edu.usc.vision.interacciones.api.utiles.BdUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test {

    public static void main(String args[]) {

        Statement stmt = null;
        String sql = null;

        try {

            Connection c = BdUtils.getSession();

            stmt = c.createStatement();

            sql = "TRUNCATE TABLE drugbank;";
            stmt.executeUpdate(sql);
            System.out.println("TRUNCATE TABLE drugbank;");

            sql = "DROP SEQUENCE seq_drugbank;";
            stmt.executeUpdate(sql);
            System.out.println("DROP SEQUENCE seq_drugbank;");

            sql = "CREATE SEQUENCE seq_drugbank start 1 increment 1;";
            stmt.executeUpdate(sql);
            System.out.println("CREATE SEQUENCE seq_drugbank start 1 increment 1;");

            sql = "INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB01048');";
            stmt.executeUpdate(sql);
            System.out.println("Insertando...");

            sql = "INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB00054');";
            stmt.executeUpdate(sql);
            System.out.println("Insertando...");

            sql = "INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB06736');";
            stmt.executeUpdate(sql);
            System.out.println("Insertando...");

            sql = "INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB01418');";
            stmt.executeUpdate(sql);
            System.out.println("Insertando...");

            stmt.close();
            c.commit();
            System.out.println("commit;");
            BdUtils.closeSession();

        } catch (Exception e) {

            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

}
