package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio15 {

    public static boolean esPalindromo(String palabra){
         palabra = palabra.toLowerCase();
         palabra = palabra.replace(" ","");

         int a=0;
         int b = palabra.length() -1;
         for(int i=0; i<palabra.length()-1; i++){
             if(palabra.charAt(a)== palabra.charAt(b)){
                 a++;
                 b--;
             }else
                 return false;
         }
         return true;
    }

    public static void main(String[] args) {

        String palabra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un palabra para saber si es un pálindromo: ");
        palabra=entrada.nextLine();

        if (esPalindromo(palabra)){
            System.out.println("La palabra: "+palabra+" es palindromo");
        }else
            System.out.println("La palabra no es palindromo");

        entrada.close();
    }
}
