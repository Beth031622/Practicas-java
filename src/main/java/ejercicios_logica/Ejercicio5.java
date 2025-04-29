package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[] array = new String[5];
        String siguiente;

        for(int i=0; i< array.length; i++){
        Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce 5 nombres: ");
            array[i] = entrada.nextLine();
        }
        siguiente= array[4];
        for(int i=3; i>=0;  i--){
            array[i+1]=array[i];
        }
        array[0]= siguiente;
        System.out.println("Arreglo con valores desplazados: ");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
