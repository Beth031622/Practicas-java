package ejercicios_basicos;

import java.util.Scanner;

public class Arbol {

    //Ejercicio del canal de Youtube "Charly Cimino".
    static final char CARACTER = 'x';
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0, espacios;
        char opcion;

        System.out.println("Quieres formar un arbol navideño?? [S/N]");
        opcion = entrada.nextLine().charAt(0);
        if (opcion != 'N' && opcion != 'n') {
            System.out.println("Ingresa un número impar mayor o igual a 3");
            numero = Integer.parseInt(entrada.nextLine());
        } else {
            System.out.println("Adios");
        }


        while (!(numero % 2 != 0 && numero >= 3)) {
            System.out.println("Ese numero es par, intentalo de nuevo con un numero impar");
            numero = Integer.parseInt(entrada.nextLine());
        }
            espacios = numero / 2;
            for (int contCaracteres = 1; contCaracteres <= numero; contCaracteres += 2) {

                for (int i = 1; i <= espacios; i++) {
                    System.out.print(" ");
                }

                for (int i = 1; i <= contCaracteres; i++) {
                    System.out.print(CARACTER);
                }
                espacios--;
                System.out.println();
            }
    }
}
