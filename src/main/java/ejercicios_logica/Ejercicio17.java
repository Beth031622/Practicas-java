package ejercicios_logica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();

        Resultado resultado = contarCaracter(frase);
        System.out.println("Cantidad de letras en la frase: "+resultado.contadorLetras);
    }


    public static Resultado contarCaracter(String frase) {
        int contadorLetras = 0;
        char[] caracteres = frase.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isLetter(caracteres[i])) {
                contadorLetras++;
            }
        }
        Resultado resultado = new Resultado();
        resultado.contadorLetras = contadorLetras;


        return resultado;
    }
}

    class Resultado {
        public int contadorLetras;
    }


