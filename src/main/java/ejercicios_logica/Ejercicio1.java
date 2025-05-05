package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] ventas = new double[7];
        int numeros = 0, suma = 0;

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Introduce la venta de esta semana: " + (1 + i));
            numeros = entrada.nextInt();
            suma = suma + numeros;

        }
        System.out.println("La venta de esta semana es de: $" + suma);
        entrada.close();

    }
}
