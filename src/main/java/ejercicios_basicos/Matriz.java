package ejercicios_basicos;

import java.util.Scanner;

public class Matriz {
    //Ejercicio del canal de Youtube "Charly Cimino".
    public static final char CARACTER= '#';
    public static void main(String[] args) {

        int ancho, alto;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingresa el ancho de la matriz:");
            ancho = Integer.parseInt(entrada.nextLine());
            while (ancho <= 0) {
                System.out.println("Número invalido! Intentalo de nuevo: ");
                ancho = Integer.parseInt(entrada.nextLine());
            }

             System.out.println("Ingresa el alto de la matriz: ");
             alto = Integer.parseInt(entrada.nextLine());
             while( alto <=0){
                System.out.println("Número invalido! Intentalo de nuevo: ");
                alto = Integer.parseInt(entrada.nextLine());
            }

        System.out.println("Datos correctos , dibujare la matriz :)");

             for (int i=1; i<=alto; i++){
                 for (int j=1; j<=ancho; j++){
                     System.out.print(CARACTER);
                 }
                 System.out.println();
             }
    }
}
