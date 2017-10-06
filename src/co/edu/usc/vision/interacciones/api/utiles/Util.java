package co.edu.usc.vision.interacciones.api.utiles;

import java.text.DecimalFormat;

/**
 * Created by vision on 1/09/17.
 */
public class Util {

    /**
     * Obtiene el salto de linea dependiento del sistema operativo
     */
    public static String saltoDeLinea = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

    /**
     * Formatea un numero con los separadores
     * @param numero
     * @return
     */
    public static String formatoNumero(int numero) {
        DecimalFormat myFormatter = new DecimalFormat("###,###.###");
        return myFormatter.format(numero);
    }


}
