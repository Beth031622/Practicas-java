package ejercicios_logica;

public class Ejercicio8 {
    public static void main(String[] args){
        int numero=520;
        String conversionCadena=String.valueOf(numero);
        System.out.println("int a string: "+conversionCadena);

        String num="1603";
        int conversionNumero=Integer.valueOf(num);
        System.out.println("String a Integer: "+conversionNumero);

        int conversionEntero=Integer.valueOf((int) Math.PI);
        System.out.println("Numero double 3.1416 a entero: "+conversionEntero);

    }
}
