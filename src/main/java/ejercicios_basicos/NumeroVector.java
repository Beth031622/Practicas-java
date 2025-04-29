package ejercicios_basicos;

public class NumeroVector {
    
    public static void main(String[] args) {

        int max=-10;
        int posicion=-0;
        int numeros [] = new int[5];

        numeros[0] = 15;
        numeros[1] = 03;
        numeros[2] = 50;
        numeros[3] = 16;
        numeros[4] = 109;

        for (int i  = 0; i <=4; i++) {
            
            if (numeros[i]>max) {
                max = numeros[i];
                posicion = i;
            }
        }

        System.out.println("El número mayor es: "+ max);
        System.out.println("El número se encuentra en la posición del array: "+ posicion);

    }
}
