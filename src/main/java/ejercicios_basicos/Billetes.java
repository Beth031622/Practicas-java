package ejercicios_basicos;

import java.util.Scanner;

public class Billetes {
    //Ejercicio del canal de Youtube "Charly Cimino"
    public static void main(String[] args) {

        int monto;
        int cant100, cant50, cant20;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto que necesita(recuerda que solo puedo devolver montos enteros): ");
        monto = Integer.parseInt(entrada.nextLine());

        cant100 = monto/100;
        monto=monto%100;

        cant50=monto/50;
        monto = monto%50;

        cant20=monto/20;
        monto = monto%20;

        System.out.println("Este es su monto en billetes: ");
        System.out.println("Billetes de 100: "+cant100);
        System.out.println("Billetes de 50: "+cant50);
        System.out.println("Billetes de 20: "+cant20);

        entrada.close();

    }
}
