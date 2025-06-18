package ejercicios_basicos;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        double total = 0; 
        System.out.println("Ingrese el plan de TV que usa (1,2 o 3): ");
        try (Scanner teclado = new Scanner(System.in)) {
            teclado.nextInt();

            int servicio = teclado.nextInt();

            if (servicio == 1) {
                total = 850 - (850 * .10);
            } 
            else {
                if (servicio == 2) {
                    total = 980 - (950 * .15);
                } 
                else {
                    if (servicio == 3) {
                        total = 1200;
                    }else{
                        System.out.println("El valor ingresado no corresponde a ningun servicio");
                    }
                }
                
            }
        }
        System.out.println("El total a pagar por su servicio es: "+total);

    }
}
