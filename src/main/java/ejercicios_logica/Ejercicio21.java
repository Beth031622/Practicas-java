package ejercicios_logica;


import java.util.HashSet;

public class Ejercicio21 {

    public static void main(String[] args) {

        int[] num = {8, 12, 15, 19, 5, 6, 1};
        int objetivo = 20;

        HashSet<Integer> buscar = new HashSet<>();


        for (int recorrer : num) {
           int complemento = objetivo - recorrer;
            if (buscar.contains(complemento)) {
                System.out.println("Los números " + recorrer + " y " + complemento + " suman=" +
                        objetivo);
            }
            buscar.add(recorrer);


        }
    }
}
