package ejercicios_logica;

public class Ejercicio18 {
    public static void main(String[] args) {

        System.out.println("Múltiplos de 3 y 5");
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" FIZZ-BUZZ");
            }else if(i%3==0){
                System.out.println(i + " FIZZ");
            }else if(i%5==0){
                System.out.println(i + " BUZZ");
            }else
                System.out.println(i+" No es múltiplo de 3 ni 5");
        }

        System.out.println("----------------");



        int suma3=0;
        int suma5=0;
        System.out.println("---Bucle para múltiplo de 3---");
        for(int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                suma3 += i;
                System.out.println(i + " Suma de multiplos de 3 es = " + suma3);
            } else if (i % 5 == 0) {
                suma5 += i;
                System.out.println(i + " Suma de multiplos de 5 es = " + suma5);
            }
        }
    }

}
