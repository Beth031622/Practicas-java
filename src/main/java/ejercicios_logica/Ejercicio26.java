package ejercicios_logica;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio26 {
static final int NOTA_MINIMA=6;
    //condicional terneario
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int calificacion;
    String resultado;

    System.out.println("Ingrese la calificación: ");
    calificacion=Integer.parseInt(entrada.nextLine());
    resultado=(calificacion >=NOTA_MINIMA ? "aprobado": "reprobado");
    System.out.println("Tu has..."+resultado);
    entrada.close();
    }


}
