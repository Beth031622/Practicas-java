package ejercicios_logica;
import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {

        int numero;
        int mayor=-0;

        for(int i=0;i<=3;i++){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca 3 números y encontrare el mayor");
        numero=entrada.nextInt();

           if(numero > mayor ){
               mayor=numero;
           }
        }

        System.out.println("El mayor es: "+mayor);
    }
}
