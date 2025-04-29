package ejercicios_basicos;

import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        int numVehiculo=0;
        int vehiculoAux=0;
        double tiempo=0;
        double mayorTiempo=-10;

        
        for (int i = 0; i < 11; i++) {
            
            Scanner teclado = new Scanner (System.in);
            System.out.println("Ingrese el número del vehiculo: ");
            numVehiculo = teclado.nextInt();
    
            System.out.println("Ingrese el tiempo que hizo en la carrera: ");
            tiempo = teclado.nextDouble();

            
            if (tiempo > mayorTiempo) {
                mayorTiempo=tiempo;
                numVehiculo=vehiculoAux;
            }
            teclado.close();
        }

        System.out.println("El vehiculo con peor tiempo en la carrera es: "+numVehiculo+" El tiempo que tardo fue: "+tiempo);

    }
    

    }
    

