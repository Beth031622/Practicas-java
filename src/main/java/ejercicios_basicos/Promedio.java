package ejercicios_basicos;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el total de calificaciones para obtener su promedio:");

        int totalCalificaciones;
        totalCalificaciones = teclado.nextInt();
        
        double[] calificacion;
        calificacion = new double [totalCalificaciones];
    
        double sumaCalificaciones = 0;

        for(int i = 0; i < totalCalificaciones; i++){
            System.out.println("Ingrese las calificaciones: " + (i+1) );
            calificacion [i] = teclado.nextDouble();
            sumaCalificaciones += calificacion[i];  
        }

        double promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("Su promedio es: "+ promedio);

        if(promedio>=6){
            System.out.println("Estas aprobado(a)");
        }else{
            System.out.println("Reprobaste");
        }
        
        teclado.close();
        }

}


