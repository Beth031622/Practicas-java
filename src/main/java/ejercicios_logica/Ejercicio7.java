package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int numeros;
        int suma = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Agrege 3 números y verificare cual es el mas pequeño");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite el número: " + (1 + i));
            numeros = entrada.nextInt();
            suma = suma + numeros;
        }

        System.out.println("La suma es: " + suma);
        entrada.close();
    }
}
