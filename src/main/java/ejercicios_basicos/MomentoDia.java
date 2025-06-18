package ejercicios_basicos;

import java.util.Scanner;

public class MomentoDia {
    //Ejercicio del canal de Youtube "Charly Cimino".
    final static int LIMITE_MAYOR=24;
    final static int LIMITE_MENOR=0;
    final static int LIMITE_MADRUGADA=5;
    final static int LIMITE_MANIANA=11;
    final static int LIMITE_MEDIODIA=13;
    final static int LIMITE_TARDE=19;

    public static void main(String[] args) {
        int hora;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la hora (entre "+LIMITE_MENOR+ " y "+ LIMITE_MAYOR+" )");
        hora= Integer.parseInt(entrada.nextLine());

        if (hora<LIMITE_MENOR){
            System.out.println("Esa hora no es válida");
        } else if (hora>LIMITE_MAYOR) {
            System.out.println("El dia solo tiene 24 horas");
        } else if (hora<=LIMITE_MADRUGADA ) {
            System.out.println("Es de madrugada,duermete");
        } else if (hora<=LIMITE_MANIANA ) {
            System.out.println("Buenos dias :)");
        } else if (hora<=LIMITE_MEDIODIA) {
            System.out.println("Ya es mediodia");
        } else if (hora<=LIMITE_TARDE) {
            System.out.println("Buenas tardes!");
        }else{
            System.out.println("Buenas noches, pronto es hora de dormir");
        }


    }
}

