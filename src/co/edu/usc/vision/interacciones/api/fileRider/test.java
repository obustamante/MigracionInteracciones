package co.edu.usc.vision.interacciones.api.fileRider;

import co.edu.usc.vision.interacciones.api.utiles.BdUtils;

import java.sql.Connection;
import java.sql.Statement;

public class test {

    public static void main(String args[]) {

        Statement stmt = null;
        String sql = null;

        try {

            Connection c = BdUtils.getSession();

            stmt = c.createStatement();

            stmt.executeUpdate("TRUNCATE TABLE drugbank;");
            System.out.println("TRUNCATE TABLE drugbank;");

            stmt.executeUpdate("DROP SEQUENCE seq_drugbank;");
            System.out.println("DROP SEQUENCE seq_drugbank;");

            stmt.executeUpdate("CREATE SEQUENCE seq_drugbank start 1 increment 1;");
            System.out.println("CREATE SEQUENCE seq_drugbank start 1 increment 1;");

            stmt.executeUpdate("INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB01048');");
            System.out.println("Insertando...");

            stmt.executeUpdate("INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB00054');");
            System.out.println("Insertando...");

            stmt.executeUpdate("INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB06736');");
            System.out.println("Insertando...");

            stmt.executeUpdate("INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), 'BTD00024', 'B01AE02','DB01418');");
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
