package ejercicios_basicos;

import java.util.Scanner;

public class PagoTrabajador {
    public static void main(String[] args) {
        double sueldoDia=0;
        double sueldoTotal;
        int diasTrabajados=0;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el monto que recibe por dia trabajado:");
        sueldoDia = teclado.nextDouble();
        System.out.println("Ingrese el total de dia trabajados:");
        diasTrabajados = teclado.nextInt();

       
        sueldoTotal = sueldoDia * diasTrabajados; 

        System.out.println("El salario que recibira esta semana es de: "+sueldoTotal);

        teclado.close();
        
    }
    
}
