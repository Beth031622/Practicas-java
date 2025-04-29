package ejercicios_logica;


import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int numero;
        int i=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número entero para verificar si es par o impar");

        for (i = 0; i <5; i++){
           numero = entrada.nextInt();
           if(numero%2==0){
               System.out.println("El número es par");
           }else{
               System.out.println("El número es impar");
           }
        }
        entrada.close();
    }
}
