package ejercicios_logica;

public class Ejercicio19 {
    public static void main(String[] args) {


        int suma=0;
        int suma3=0;
        int suma5=0;

        for(int i=0; i<=100; i++){
           suma3+=(i%3==0)?i:0;
           suma5+=(i%5==0)?i:0;
           suma+=(i%3==0 || i%5==0)?i:0;
        }
        System.out.println("Suma de múltiplos 3: "+suma3);
        System.out.println("Suma de múltiplos 5: "+suma5);
        System.out.println("Suma de múltiplos 3 y 5: "+suma);
    }
}
