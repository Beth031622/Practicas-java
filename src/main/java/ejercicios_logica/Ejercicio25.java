package ejercicios_logica;

public class Ejercicio25 {
    public static void main(String[] args) {
        String uso = "Diana10Abril03Emma16Javier31!!";
        System.out.println("Cadena original " + uso);

        //d+ quitara cualquier digito encontrado
        String nuevoUso = uso.replaceAll("\\d+", "");
        System.out.println("Cadena sin números: " + nuevoUso);

        //D qquitara cualquier letra encontrada
        String nuevoUso2 = uso.replaceAll("\\D+", "");
        System.out.println("Cadena sin letras: " + nuevoUso2);

        // la diagonal invertida \ se puede usar para volver a usar comillas dobles en un String
        System.out.println("Descartes dijo: \"Pienso luego existo\"");



    }
}

