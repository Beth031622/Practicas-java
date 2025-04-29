package ejercicios_basicos;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Realizaremos una división entre números enteros");
        lectura.nextLine();
        System.out.println("Ingrese el primer valor");
        int valor1 = lectura.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = lectura.nextInt();

        try {
            int multiplicacion = valor1 / valor2;
            System.out.println("El resultado es: " + multiplicacion);
        } catch (Exception e) {
            System.out.println("ERROR! division entre 0");
        } finally {
            System.out.println("Ingresa 2 valores mayores a 0 para realizar la división");
        }
        lectura.close();
    }

}

