package ejercicios_basicos;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        String nombre;
        int edad;

        try (Scanner teclado = new Scanner (System.in)) {
            System.out.println("Dime como te llamas:");
            nombre = teclado.nextLine();
        }
            try (Scanner teclado2 = new Scanner (System.in)) {
                System.out.println("Cual es tu edad:");
                edad = teclado2.nextInt();
            }
            System.out.println("Hola "+ nombre + " yo se que tienes "+ edad + " anios" );
    }
}
