package ejercicios_basicos;

import java.util.Scanner;

public class Contraseña {
    static final int INTENTOS_MAXIMOS = 3;
    static final String NOMBRE_CORRECTO="Diana";
    static final String CLAVE_CORRECTA= "031622";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre,clave;
        int intentos=0;
        boolean error;

       do {
           System.out.print("Ingrese su nombre: ");
           nombre = entrada.nextLine();
           System.out.print("Ingrese su clave: ");
           clave = entrada.nextLine();
           error = !nombre.equalsIgnoreCase(NOMBRE_CORRECTO) || !clave.equals(CLAVE_CORRECTA);
           intentos++;
       }while(error && intentos<INTENTOS_MAXIMOS);

       if(error){
           System.out.println("No ha podido ingresar");
       }else{
           System.out.println("Bienvenido");
       }

    }
}
