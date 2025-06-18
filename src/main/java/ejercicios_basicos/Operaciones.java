package ejercicios_basicos;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, eliga una de las siguientes opciones:");

        for (int i = 0; i <= 4; i++) {
            do {
                System.out.println("1.Poema \n 2.cancion \n 3.reflexion \n 4.salir");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        String poema = "La primavera ha veniido nadie sabe como ha sido , he despertado la rama y el almendro ha florecido";
                        System.out.println(poema);
                        break;
                    case 2:
                        String cancion = "Yo te llevo dentro hasta la raiz y por mas que crezca has de estar ahi...";
                        System.out.println(cancion);
                        break;
                    case 3:
                        String reflexion = "Lo que sabemos es una gota de agua, lo que ignoramos es un océano";
                        System.out.println(reflexion);
                        break;
                    case 4:
                        System.out.println("Gracias");
                        break;
                    default:
                        System.out.println("No cuento con esa opción");
                }

            } while (opcion == 4);
        }
            entrada.close();
    }
}
