package ejercicios_basicos;

public class IntercambioNumeros {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 3;
        int aux;
    
        System.out.println("El valor del primer número es: "+num1);
        System.out.println("El valor del segundo número es: "+num2);
        
        aux=num1;
        num1=num2;
        num2=aux;

        System.out.println("El valor del primer número despues del intercambio es: "+num1);
        System.out.println("El valor del segundo número despues del intercambio  es: "+num2);
    }
    
}
