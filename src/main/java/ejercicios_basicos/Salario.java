package ejercicios_basicos;

import java.util.Scanner;

public class Salario {
    //Ejercicio del canal de Youtube "Charly Cimino".
    public static void main(String[] args) {

        int edad;
        double sueldo,impuesto,porcentaje=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido! Porfavor ingresa tu edad: ");
        edad = Integer.parseInt(entrada.nextLine());

        System.out.println("Porfavor ingresa tu sueldo anuel: ");
        sueldo = Integer.parseInt(entrada.nextLine());


        if(edad > 0 && sueldo > 0){
            if(sueldo < 10000) {
              porcentaje= 0.5;
            } else if (sueldo < 20000 ) {
               porcentaje= 1.00;
            } else if (sueldo < 30000) {
                porcentaje = 2.00;
            } else{
                porcentaje = 2.5;
            }

            impuesto = sueldo * (porcentaje/100);

            if (edad < 30){
                impuesto = impuesto + impuesto * (20.0/100);
            }

            System.out.println("El impusto sera de: "+impuesto);
        }else{
            System.out.println("Los datos ingresados son inválidos");
        }
    }
}

// <  |