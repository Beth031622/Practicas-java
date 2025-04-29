package ejercicios_basicos;

class Contador2En2{
    public static void main(String[] args) {
        int inicio=200;

        for (int i = 200; i <= 250; i +=2) {
            System.out.println("El contador va en el número" + (i));
            
        }

        System.out.println("____________________________");

        while (inicio <=250) {
            System.out.println("El contador va en el número: " + inicio);
            inicio +=2;
        }
       
        }
    }
