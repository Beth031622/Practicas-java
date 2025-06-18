package ejercicios_logica;

import java.text.NumberFormat;
import java.util.Locale;

public class Ejercicio22 {
    public static void main(String[] args){
        //Este ejercicio es copia y pega de una guia , solo para ver los resultados en compilación

        NumberFormat formatoNumero1 = NumberFormat.getInstance();

        String resultado = formatoNumero1.format(1603.1031);
        System.out.println(resultado);

        resultado = NumberFormat.getInstance(Locale.UK).format(1603.1031);
        System.out.println(resultado);
        resultado = NumberFormat.getInstance(Locale.US).format(1603.1031);
        System.out.println(resultado);

        System.out.println("Guia");
        NumberFormat formatoNumero2 = NumberFormat.getNumberInstance(Locale.US);
        String resultado2 = formatoNumero2.format(1603.1031);
        System.out.println(resultado2);

        NumberFormat formatoNumero3 = NumberFormat.getCurrencyInstance(Locale.US);
        String resultado3 = formatoNumero3.format(1603.1031);
        System.out.println(resultado3);

        NumberFormat formatoNumeros4 = NumberFormat.getPercentInstance(Locale.US);
        String resultado4 = formatoNumeros4.format(.1603);
        System.out.println(resultado4);
    }
}
