package ejercicios_logica;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Ingrese su nombre: ");
        nombre= entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad= Integer.parseInt(entrada.nextLine());

        System.out.println("Hola! "+nombre+" Tu edad es: "+edad);

        System.out.println("_______________________");

        double estatura,peso;
        double imc;

        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu estatura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso: "));

        imc=peso/(estatura*estatura);
        JOptionPane.showMessageDialog(null,"Tu IMC es:"+imc);
    }
}
