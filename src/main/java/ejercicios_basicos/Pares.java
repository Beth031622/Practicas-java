package ejercicios_basicos;

import java.util.Scanner;

public class Pares{

    public static void main(String[] args) {

        //Declaracion de el tamaño del array
        int[] numeros = new int[5]; 

        //Declaracion de entrada por  teclado para el usuario
        Scanner teclado = new Scanner (System.in);
        //recorrido del array 
        for(int i=0; i<=4; i++){
        //variable donde se guardara el valor de la entrada por teclado
        int num;
        //Mensaje que se le muestra al usuario y sepa que hacer
        System.out.println("Ingrese un número:");
        //Lectura del valor ingresado
        num = teclado.nextInt();
        
        /*Condicional para que el programa saque el residuo de la divison
         y determine si el numero es par o impar*/
            if (num %2 == 0) {
                System.out.println("El número es par " + numeros[i]);
            }else{
               System.out.println("El número es impar " + numeros[i]);
            }

        }
          
        //termino de la lectura por teclado
        teclado.close();

        
    }
}