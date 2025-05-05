package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {


        int[] numeros;
        int guardarNum;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del conjunto de números: ");
        guardarNum=entrada.nextInt();

        numeros=new int [guardarNum];


        for (int i=0; i < guardarNum; i++) {
            System.out.println("Ingrese los valores: "+(1+i));
            numeros[i]=entrada.nextInt();
        }

        int valorMinimo=numeros[0];
        int posicion=0;

        for (int i=1; i < guardarNum; i++) {
            if (numeros[i] < valorMinimo) {
                valorMinimo = numeros[i];
                posicion=i;
            }
        }

        System.out.println("El número menor es: "+valorMinimo+" en la posicion--"+posicion);
        entrada.close();
    }
}
