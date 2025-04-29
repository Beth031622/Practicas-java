package ejercicios_basicos;

public class Imc {
    public static void main(String[] args) {
        double peso = 54.500;
        double estatura = 1.60;

        double imc = peso/(estatura*estatura);

        System.out.println("La masa corporal de la persona es: " + imc);


        //pedir las entradas por teclado
    }
    
}
