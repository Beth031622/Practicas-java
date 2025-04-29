package ejercicios_basicos;

import java.util.Scanner;

public class Servicios{
    public static void main(String[] args){

        int servicio;
        int total;
        int vapor=20;
        int dumpling=25;
        int ramen=50;
        int charolaVapor=100;
        int charolaDumpling=120;


        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido(a)! Ingrese el menu que desea(1 al 7): ");
        
        System.out.println("---------------------");
        
        System.out.println("1: 1 pieza de pan al vapor $20");
        System.out.println("2: 3 pzas de pan al vapor $50");
        System.out.println("3: charola con 6pzas de pan $100 ");
        System.out.println("4: 1 dumpling $25");
        System.out.println("5: 3 pzas de dumplings $60");
        System.out.println("6: charola de dumplings con 6 pzas $120");
        System.out.println("7: Ramen preparado $50");


        switch (servicio=teclado.nextInt()) {
            case 1:
            System.out.println("Eligio el paquete 1, el total a pagar es: "+(total=vapor));
                
                break;
            case 2:
            System.out.println("Eligio el paquete 2, el total a pagar es: "+(total=vapor*3));
               break;
            case 3:
            System.out.println("Eligio el paquete 3, el total a pagar es: "+(total=charolaVapor));
            case 4:
            System.out.println("Eligio el paquete 4, el total a pagar es: "+(total=dumpling));
               break;
            case 5:
            System.out.println("Eligio el paquete 5, el total a pagar es: "+(total=dumpling*3));
                  break;
            case 6:
            System.out.println("Eligio el paquete 6, el total a pagar es: "+(total=charolaDumpling));
                     break;
            case 7:
            System.out.println("Eligio el paquete 7, el total a pagar es: "+(total=ramen));
                        break;
        
            default:
             System.out.println("Lo sentimos no contamos con ese número de paquete: ");
                break;
        }

        teclado.close();

    }
}