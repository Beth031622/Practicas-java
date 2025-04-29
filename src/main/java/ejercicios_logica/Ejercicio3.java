package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int aprobado=0,reprobado=0,excelencia=0;
        double calificacion = 5;
        int i=0;

        Scanner entrada = new Scanner(System.in);
      while(i<5){
          System.out.println("Introduzca la calificación del alumno(a)");
          calificacion=entrada.nextDouble();

          if (calificacion >= 9 && calificacion <=10) {
              excelencia++;
              System.out.println("Felicidades, eres excelente!!");
          } else if (calificacion>=6) {
              aprobado++;
              System.out.println("Has aprobado");
          } else {
              reprobado++;
              System.out.println("Reprobaste");
          }
          i++;
      }
          System.out.println("El número de alumno(a)s de excelencia es: "+excelencia);
          System.out.println("El número de alumno(a)s de aprobados es: "+aprobado);
          System.out.println("El número de alumno(a)s de reprobados es: "+reprobado);

          
      




    }
}
