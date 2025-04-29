package ejercicios_logica;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int arrayDestino[] = new int [10];
        int i,j;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 5 valores para el arreglo 1: ");
        for(i=0; i<array1.length; i++){
            System.out.println("Posicion: " + (i+1) + " ");
            array1[i]=entrada.nextInt();
        }

        System.out.println("Ingrese 5 valores para el arreglo 2 ");
        for(i= 0; i < array2.length; i++){
            System.out.println("Posicion: " + (i+1) + " ");
            array2[i]=entrada.nextInt();
        }

        System.out.println("Juntare los arreglos 1 y 2 en un nuevo arreglo ");
        j=0;
        for (i=0; i<arrayDestino.length; i++){
            arrayDestino[j]=array1[i];
            System.out.println(arrayDestino[j]);
            j++;
            arrayDestino[j]=array2[i];
            System.out.println(arrayDestino[j]);
            j++;

        }
    }
}
