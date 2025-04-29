package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int arreglo[] = new int[5];
        int max =arreglo[0];



        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < arreglo.length; a++) {
            System.out.println("Ingresa 5 números enteros: "+(a+1));
            arreglo[a] = sc.nextInt();

            if (arreglo[a] > max) {
                max = arreglo[a];
            }


        }
        System.out.println("El valor mas alto es: "+max);
        sc.close();

    }
}
