package ejercicios_basicos;

import java.util.Scanner;

public class Ciclos {
    public static final int MAYOR_EDAD=18;
    public static final int MAXIMO=10;
    public static final int MINIMO=1;
    public static final String CORTE= "*";
    public static final String NOMBRE_INVALIDO="XXXXX";

    public static void main(String[] args) {

        //Ciclo para factorial
        int numero;
        int sumatoria=1;
        Scanner entrada0 = new Scanner(System.in);
        System.out.println("Ingrese un número para mostrar su factorial:");
        numero = Integer.parseInt(entrada0.nextLine());
        if(numero>0){
            for (int i =1; i<=numero; i++){
                sumatoria = sumatoria*i;
            }
            System.out.println("El factorial es: "+sumatoria);
        }else{
            System.out.println("No puedo realizar el cálculo con valores negativos");
        }

        //Ciclo para cuenta regresiva
        int numero1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero1 = Integer.parseInt(entrada.nextLine());

        if(numero1>0){
            int contador = numero;
            while(contador >= 0){
                System.out.print("Cuenta regresiva..."+contador+" ");
                contador --;
            }
        }else{
            System.out.println("No puedo hacer cuentas regresivas con valores menores a 0");
        }

        //Ciclo tabla de multiplicar
       int tabla;

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese la tabla que desee saber "+"(entre "+ MINIMO +" Y "+ MAXIMO+" )");
        tabla = Integer.parseInt(entrada2.nextLine());

        if (tabla>=MINIMO&& tabla<=MAXIMO){
            for (int i =1; i<=10;i++){
                System.out.println(tabla+" x "+i+" = "+(tabla*i));
            }
        }else{
            System.out.println("No cuento con esa tabla de multiplicar");
        }


        //Ciclo para edades
        int numPersonas,contMayoresEdad = 0,edad3=0;
        double porcentajeMayores=0;
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Ingrese el número total de personas");
        numPersonas = Integer.parseInt(entrada3.nextLine());

        for(int i=1; i<=numPersonas; i++){
            System.out.println("Ingrese la edad de la persona: "+i);
            edad3 = Integer.parseInt(entrada3.nextLine());
        }
        if(edad3>0){
            if(edad3>=MAYOR_EDAD){
            contMayoresEdad++;
            porcentajeMayores=(contMayoresEdad*100)/numPersonas;

        System.out.print("La lista de edades es la siguiente: "+edad3);
        System.out.println(" ");
        System.out.println("El porcentaje de las personas mayores de edad es: "+porcentajeMayores+"%");
            }
        }else {
            System.out.println("No se permiten edades menores a 0");

            //Ciclo para edades mayores y minimas
            int edad, edadMinima = Integer.MAX_VALUE, edadMayor = Integer.MIN_VALUE;
            String nombre, personaMasJoven = NOMBRE_INVALIDO, personaMasGrande = NOMBRE_INVALIDO;
            Scanner entrada4 = new Scanner(System.in);

            System.out.println("Ingrese el nombre de la persona: ");
            System.out.println("Presione " + CORTE + " para salir");
            nombre = entrada4.nextLine();

            while (!nombre.equals(CORTE)) {
                System.out.println("Ahora ingrese la edad de " + nombre + " :");
                edad = Integer.parseInt(entrada4.nextLine());

                if (edad < edadMinima) {
                    edadMinima = edad;
                    personaMasJoven = nombre;
                }
                if (edad > edadMayor) {
                    edadMayor = edad;
                    personaMasGrande = nombre;

                }

                System.out.println("Ingrese el siguiente nombre: ");
                nombre = entrada4.nextLine();
            }

            if (!personaMasJoven.equals(NOMBRE_INVALIDO)) {
                System.out.println("La persona mas joven es: " + personaMasJoven + " tiene " + edadMinima + " años");
            }
            if (!personaMasGrande.equals(NOMBRE_INVALIDO)) {
                System.out.println("La persona mas grande es: " + personaMasGrande + " tiene " + edadMayor + " años");
            } else {
                System.out.println("El nombre es invalido");
            }

        }
    }
}


