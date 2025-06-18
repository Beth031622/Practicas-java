package ejercicios_basicos;

import java.util.Scanner;

public class Mercado {

    public static void main(String[] args) {
        int cantidad;
        double precio,total=0;
        char opcion;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de articulos: ");
            cantidad = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese su precio: ");
            precio = Double.parseDouble(entrada.nextLine());
            System.out.println("Deseas ingresar mas artuculos? [S/N]");
            opcion = entrada.nextLine().charAt(0);
        total += cantidad * precio;
        }while(opcion != 'N' && opcion != 'n');


        System.out.println("El precio a pagar es: $"+total);
    }
}
