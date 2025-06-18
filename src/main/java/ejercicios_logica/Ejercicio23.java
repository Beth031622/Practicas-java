package ejercicios_logica;

public class Ejercicio23 implements Runnable{
    //Este ejercicio es copia y pega de una guia , solo para ver los resultados en compilación

    int i;
    @Override
    public void run() {
        if(i%10 !=0)
            i++;
        for (int x = 0; x < 10; x++,i++) {
            if(x == 4){
                System.out.println(i+"SALIDA DE RUN: ");
            }
        }
        Thread.yield();
    }

    public static void main(String[] args) {
        Ejercicio23 ejemplo = new Ejercicio23();
        for (int x = 0; x < 100; x++){
            new Thread(ejemplo).start();
        }
    }
}
