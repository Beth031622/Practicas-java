package ejercicios_basicos;

import java.util.Scanner;

public class NumeroRepetido {
    public static void main(String[] args) {
        int cont=0;
        int[] numeros = new int [10];
    
        Scanner teclado = new Scanner (System.in);
        

        for(int j = 0; j < numeros.length; j++){
            System.out.println("Porfavor ingrese 10 números enteros: ");
            numeros [j] = teclado.nextInt();
             

            for (int i = 0; i< numeros.length; i++) {
                
                if (numeros[j]==3) {
                    cont ++;
                    
                }if (cont>0) {
                    System.out.println("El número 3 aparecio esta cantidad de veces "+ cont);
                }else{
                    System.out.println("No hay ningun número 3");
                }
            }


            teclado.close();
        }

        

    }
}
