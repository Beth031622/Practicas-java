package ejercicios_basicos;

import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        
        double ancho,largo;
        double precio;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el ancho del terreno en metros: ");
        ancho = Double.parseDouble(entrada.nextLine());

        System.out.println("Ingresa el largo del terreno en metros: ");
        largo = Double.parseDouble(entrada.nextLine());

        System.out.println("Ahora ingresa el precio por metro cuadrado del terreno: ");
        precio = Double.parseDouble(entrada.nextLine());

        double precioTerreno = (ancho*largo)*precio;
        double valla  = ancho*largo;

        System.out.println("El precio del terreno es : $"+precioTerreno);
        System.out.println("Necesitas "+valla+"m de alambre para cercar el terreno");
    }
}
