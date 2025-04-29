package ejercicios_basicos;

import java.util.Scanner;

public class Area{
    public static void main(String[] args) {

        double radio;
        double area;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el valor del radio del circulo: ");
        radio = teclado.nextDouble();

        area = Math.PI * (radio*radio);

        System.out.println("El área del circulo es igual a: "+ area);

        teclado.close();

    }
}
