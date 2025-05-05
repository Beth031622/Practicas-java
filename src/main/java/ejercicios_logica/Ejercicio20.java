package ejercicios_logica;

import java.util.Arrays;

public class Ejercicio20{
    public static void main(String[] args){
        int [] original = {1,2,3,4,5};
        int [] invertido = new int [original.length];
        int posicion = original.length-1;

        System.out.println("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(" "+original[i]);
        }

        System.out.println("Arreglo invertido: ");
        for (int i = 0; i < original.length; i++) {
            invertido[i]=original[posicion];
            posicion--;
            System.out.print(" "+invertido[i]);
        }
    }
}
