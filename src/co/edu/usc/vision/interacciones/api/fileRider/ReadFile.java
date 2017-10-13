package co.edu.usc.vision.interacciones.api.fileRider;

import co.edu.usc.vision.interacciones.api.utiles.BdUtils;
import co.edu.usc.vision.interacciones.api.utiles.Util;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vision on 25/08/17.
 */
public class ReadFile {

    private int ii;

    public ReadFile(String file) {
        readFile(file);

    }

    /**
     * Abre y lee un archivo.
     *
     * @param filename
     */
    private void readFile(String filename) {

        cleanDrugbank();

        String drugbank_id = null;
        String atc_id = null;
        String drugbank_id_asociado = null;

        int totalLineas = 0;

        final String regexDrugId = "<drugbank-id primary=\"true\">(.+?)<.drugbank-id>";
        final String regexATC = "^\\n*\\s*<atc-codes>$";
        final String regexInteraccionOpen = "^\\n*\\s*<drug-interactions>$";
        final String regexInteraccionClose = "^\\n*\\s*<.drug-interactions>$";
        final String regexDrugbankId = "<drugbank-id>(.+?)+<.drugbank-id>";

        final Pattern patternDrugId = Pattern.compile(regexDrugId);
        final Pattern patternATC = Pattern.compile(regexATC);
        final Pattern patternInteraccionOpen = Pattern.compile(regexInteraccionOpen);
        final Pattern patternInteraccionClose = Pattern.compile(regexInteraccionClose);
        final Pattern patternDrugbankId = Pattern.compile(regexDrugbankId);

        List<String> records = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {

                final Matcher matcherId = patternDrugId.matcher(line);

//                drugbank_id = null;
//                atc_id = null;

                //Lectura de drugbank-id primary
                while (matcherId.find()) {
                    line = reader.readLine();
                    drugbank_id = line.substring(15, 23);
//                    System.out.println(drugbank_id + " - id-drugbank");
                    totalLineas += 1;
                    break;
                }

                final Matcher matcherACT = patternATC.matcher(line);

                // lectura del ATC
                while (matcherACT.find()) {
                    line = reader.readLine();
                    atc_id = line.substring(20, 27);
//                    System.out.println("    " + atc_id + " - id-atc");
                    totalLineas += 1;
                    break;
                }

                //Lectura de interacciones de medicamentos
                final Matcher matcherInteraccionOpen = patternInteraccionOpen.matcher(line);

                boolean interaccionesOpen = matcherInteraccionOpen.find();

//                drugbank_id_asociado = null;

                while (interaccionesOpen) {
                    //Lectura de las interacciones asociadas
                    line = reader.readLine();
                    totalLineas += 1;

                    final Matcher matcherDrugbankId = patternDrugbankId.matcher(line);
                    // imprime el Drugbank-Id asociado si es encontrado
                    if (matcherDrugbankId.find()) {

                        drugbank_id_asociado = line.substring(20, 26);
//                        System.out.println("        " + drugbank_id_asociado + " - Drugbank-Id asociado");

                        // insertando en la tabla Drugbank
                        insertDrugbank(drugbank_id, atc_id, drugbank_id_asociado );

                    }

                    //sale de las interacciones
                    final Matcher matcherInteraccionesClose = patternInteraccionClose.matcher(line);
                    if (matcherInteraccionesClose.find()) {
                        break;
                    }

                }

                records.add(line);
                totalLineas += 1;
            }
            reader.close();
            //return records;
        } catch (Exception e) {
            System.err.format("Se ha producido una excepción intentando leer '%s'.", filename);
            e.printStackTrace();
            //return null;
        }


        System.out.println("Fin de la lectura de archivo. " + Util.saltoDeLinea + "Total de lineas = " + Util.formatoNumero(totalLineas));

    }

    /**
     * Prepara la tabla Drugbank para insertar los nuevos datos
     */
    private void cleanDrugbank() {

        Statement stmt = null;

        Connection c = BdUtils.getSession();

        try {

            stmt = c.createStatement();

            stmt.executeUpdate("TRUNCATE TABLE drugbank;");
            System.out.println("TRUNCATE TABLE drugbank;");

            stmt.executeUpdate("DROP SEQUENCE seq_drugbank;");
            System.out.println("DROP SEQUENCE seq_drugbank;");

            stmt.executeUpdate("CREATE SEQUENCE seq_drugbank start 1 increment 1;");
            System.out.println("CREATE SEQUENCE seq_drugbank start 1 increment 1;");

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


    /**
     * Insertar datos en la tabla Drugbank
     * @param drugbank
     * @param atc
     * @param asociado
     */
    private void insertDrugbank(String drugbank, String atc, String asociado) {
        Statement stmt = null;
        int seq_drugbank;

        Connection c = BdUtils.getSession();

        try {

            stmt = c.createStatement();


//            System.out.println("INSERT INTO drugbank (id, drugbank_id, atc, interaccion) VALUES (nextval('seq_drugbank'), " + drugbank + "," + atc + "," + asociado + ");");

            stmt.executeUpdate("INSERT INTO drugbank (id                     ,    drugbank_id  , atc       ,   interaccion) VALUES " +
                                                      " (nextval('seq_drugbank'), '" + drugbank + "','" + atc + "','" + asociado + "');");
//            System.out.println("Insertando...");



            stmt.close();
            c.commit();
//            System.out.println("commit;");
            BdUtils.closeSession();



        } catch (Exception e) {

            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


    }

    public static void main(String[] args) {


        JFrame f = new JFrame("drugbank");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = f.getContentPane();
        JProgressBar progressBar = new JProgressBar();
        // Play animation
        progressBar.setIndeterminate(true);
        //progressBar.setValue(25);
        //progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Insertando datos...");
        progressBar.setBorder(border);
        content.add(progressBar, BorderLayout.NORTH);
        f.setSize(300, 100);
        f.setVisible(true);


        //String rutaArchivo = "/home/vision/Obustamante/drugbank/full database3.xml";
        String rutaArchivo = "/home/vision/Obustamante/drugbank/full database.xml";

        System.out.println("Inicia la lectura de archivo " + rutaArchivo);

        ReadFile rf = new ReadFile(rutaArchivo);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*

        JFrame parentFrame = new JFrame();
        parentFrame.setSize(500, 150);
        JLabel jl = new JLabel();
        jl.setText("Count : 0");

        parentFrame.add(BorderLayout.CENTER, jl);
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        parentFrame.setVisible(true);

        final JDialog dlg = new JDialog(parentFrame, "Progress Dialog", true);
        JProgressBar dpb = new JProgressBar(0, 500);
        dlg.add(BorderLayout.CENTER, dpb);
        dlg.add(BorderLayout.NORTH, new JLabel("Progress..."));
        dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dlg.setSize(300, 75);
        dlg.setLocationRelativeTo(parentFrame);

        Thread t = new Thread(new Runnable() {
            public void run() {
                dlg.setVisible(true);
            }
        });
        t.start();
        for (int i = 0; i <= 500; i++) {
            jl.setText("Count : " + i);
            dpb.setValue(i);
            if(dpb.getValue() == 500){
                dlg.setVisible(false);
                System.exit(0);

            }
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dlg.setVisible(true);
*/
    }

}
