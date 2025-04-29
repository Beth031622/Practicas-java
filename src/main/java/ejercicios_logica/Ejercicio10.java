package ejercicios_logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double sueldo;
        double pagoDia;

        try {
            System.out.println("Ingrese su sueldo semanal: ");
            sueldo = Double.parseDouble(bf.readLine());
            pagoDia = sueldo/7;
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            throw new RuntimeException(e);
        }

        System.out.println("Su pago por dia es: " + pagoDia);


    }
}
