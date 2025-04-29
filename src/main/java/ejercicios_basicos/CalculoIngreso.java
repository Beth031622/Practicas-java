package ejercicios_basicos;

import java.util.Scanner;

public class CalculoIngreso {

    public static void main(String[] args) {
        
        double num1;
        double num2;
        double resultado=0;
        char operador;
        int contador;
       

        contador = 1;

        
        while (contador<5) {
             Scanner teclado = new Scanner (System.in);
             System.out.println("Ingrese el primer número: ");
             num1 = teclado.nextInt();
             

             System.out.println("Ingrese el segundo número: ");
             num2 = teclado.nextInt();
            

             System.out.println("Ingrese la operación que necesita realizar(+,-,* o /): ");
             operador = (char) teclado.nextInt();
             
             if (operador == '+'){
                 resultado = num1+num2;
                }
                else{
                    if (operador == '-') {
                        resultado = num1-num2;
                    }
                    else{
                         if (operador == '*') {
                            resultado = num1*num2;
                         }
                         else{
                            if (operador== '/') {
                                resultado = num1/num2;
                            }
                         }
                         
                    }
                }

                contador = contador+1;
            System.out.println("El resultado de la operación es: "+ resultado);
            

            teclado.close();
        }

    }
    
}
