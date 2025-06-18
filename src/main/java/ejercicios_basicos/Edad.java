package ejercicios_basicos;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        int nacimiento, actual;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el año de nacimiento y te dire tu edad: ");
        nacimiento = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingresa el año actual:");
        actual = Integer.parseInt(entrada.nextLine());

        int resultado= actual-nacimiento;
        System.out.println("Tu edad es: "+resultado);

        entrada.close();
    }
}
