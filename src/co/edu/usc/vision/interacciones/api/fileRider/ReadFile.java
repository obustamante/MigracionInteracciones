package co.edu.usc.vision.interacciones.api.fileRider;


import co.edu.usc.vision.interacciones.utiles.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vision on 25/08/17.
 */
public class ReadFile {


    public ReadFile(String file) {
        readFile(file);

    }

    /**
     *
     * Abre y lee un archivo.
     * @param filename
     */
    private void readFile(String filename) {

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

                //Lectura de drugbank-id primary
                while (matcherId.find()){
                    line = reader.readLine();
                    System.out.println(line);
                    totalLineas += 1;
                    break;
                }


                final Matcher matcherACT = patternATC.matcher(line);

                // lectura del ATC
                while (matcherACT.find()) {
                    line = reader.readLine();
                    System.out.println(line);
                    totalLineas += 1;
                    break;
                }

                //Lectura de interacciones de medicamentos
                final Matcher matcherInteraccionOpen = patternInteraccionOpen.matcher(line);

                boolean interaccionesOpen = matcherInteraccionOpen.find();

                while (interaccionesOpen) {
                    //Lectura de las interacciones asociadas
                    line = reader.readLine();
                    totalLineas += 1;


                    final Matcher matcherDrugbankId = patternDrugbankId.matcher(line);
                    // imprime el Drugbank-Id asociado si es encontrado
                    if(matcherDrugbankId.find()){
                        System.out.println(line);
                    }

                    //sale de las interacciones
                    final Matcher matcherInteraccionesClose = patternInteraccionClose.matcher(line);
                    if (matcherInteraccionesClose.find()) {
                        break;
                    }

                }


                //Lectura de interacciones de comida
                //TODO: Se debe de adicionar la interacciones con la comida?


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


    public static void main(String[] args) {

        String rutaArchivo = "/home/vision/Obustamante/drugbank/full database3.xml";

        System.out.println("Inicia la lectura de archivo " + rutaArchivo);

        ReadFile rf = new ReadFile(rutaArchivo);


    }


}
