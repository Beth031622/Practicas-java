package ejercicios_logica;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int orden[]=new int[10];
        int num=0,posicion=0,a=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Agrega 5 numeros en orden ascendete: ");

        for(int b=0; b<5; b++) {
            System.out.println("Número: " + (b+1));
            orden[b]=sc.nextInt();
        }

        System.out.println("Introduce un número aleatorio para introducirlo en su posicion correspondiente");
        num=sc.nextInt();
        while(orden[a]<num && a<4){
            posicion++;
            a++;
        }
        for(int b=4; b>=posicion; b--){
            orden[b+1]=orden[b];
        }
        orden[posicion]=num;
        System.out.println("He introducido el número sin afectar el ordden ");
        for (int b=0; b<6; b++){
        System.out.println(Arrays.toString(orden));
        }
        sc.close();
    }
}
