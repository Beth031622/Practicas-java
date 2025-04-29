package ejercicios_basicos;

public class EjercicioTablas {
    public static void main(String[] args) {

        //Bucle para tablas
        System.out.println("Tabla del 4 empezando en 5");
        for (int a = 4; a == 4; a++) {
            for (int b = 5; b <= 10; b++) {

                System.out.println(a + " x " + b + " = " + a * b);
            }
         }



        //Bucle para conteo
        System.out.println("El conteo empieza en 50");
        for(int i=50; i<=100; i= i + 2){
            System.out.println("El conteo de 2 en 2 suma a: "+ i);

        }

        //Bucle decremento
        System.out.println("El conteo empezó en el 100");
        for(int d =100; d >= 0; d = d-4){
            System.out.println("La numeracion decrementa"
                    + d);

        }

    }
}