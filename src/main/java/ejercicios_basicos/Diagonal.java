package ejercicios_basicos;

public class Diagonal {

    public static void main(String[] args) {

        int [][] diagonal = {
            {1,0,0,0,0,0},
            {1,1,1,1,1,1},
            {2,2,1,2,2,2},
            {3,3,3,1,3,3},
            {4,4,4,4,1,4},
            {5,5,5,5,5,1}
        };

    
        for (int f = 0; f < diagonal.length; f++) {
            
            
            for (int c = 0; c < diagonal[f].length; c++) {
                System.out.print(diagonal[f][c] + " ");
            }

            System.out.println( );

        }

    

    }
    
}
