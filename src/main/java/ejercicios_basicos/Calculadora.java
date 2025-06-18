package ejercicios_basicos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        int num1=0;
        int num2=0;
        int operacion=0;
        int resultado=0;


        try{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a Mi Calculadora!!");
        System.out.println("Ingresa el primer número: ");
        num1=entrada.nextInt();
        System.out.println("Ingresa el segundo número: ");
        num2=entrada.nextInt();

        do {
        System.out.println("Ahora indica que operación deseas realizar: \n" +
                "1:suma " + " 2:resta " + " 3:multiplicación " + " 4:división " );
        operacion=entrada.nextInt();

        }while(operacion<1  || operacion>5);
            switch (operacion){
                case 1:
                    resultado=num1+num2;
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado=num1*num2;
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    resultado=num1/num2;
                    System.out.println("Resultado de la división: " + resultado);
                    break;
                default:
                    System.out.println("No puedo realizar esa operación");
            }
        }catch(ArithmeticException arithmeticException){
            System.out.println("No puedo realizar operaciones con números negativos");
        }
        finally{
            System.out.println("Gracias por usar Mi Calculadora");
        }
    }
}
