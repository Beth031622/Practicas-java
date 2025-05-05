package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        String palabra;
        String conversionMayus, conversionMinus;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        palabra=entrada.nextLine();

        conversionMayus = palabra.toUpperCase();
        conversionMinus = palabra.toLowerCase();

        System.out.println("Taran! frase en minúsculas: " + conversionMinus);
        System.out.println("Taran! frase en mayúsculas: " + conversionMayus);
    }
}
