public class exercicioTania {

    public static void main(String[] args) {
        int linha = 2;
        int coluna = 3;
        int linha2 = 3;
        int coluna2 = 2;
        int[][] matriz1 = new int [linha][coluna];
        
        matriz1[0][0] = 3;
        matriz1[0][1] = 1;
        matriz1[0][2] = 3;
        matriz1[1][0] = 6;
        matriz1[1][1] = 5;
        matriz1[1][2] = 5;
        
        System.out.println("MATRIZ 1:");
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(" " + matriz1[i][j]);
            }
            System.out.println(" ");
        }
        
        int[][] matriz2 = new int [linha2][coluna2];
        
        matriz2[0][0] = 100;
        matriz2[1][0] = 50;
        matriz2[2][0] = 50;
        matriz2[0][1] = 50;
        matriz2[1][1] = 100;
        matriz2[2][1] = 50;
        
        System.out.println(" ");
        System.out.println("MATRIZ 2:");
        
        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.print(" " + matriz2[i][j]);
            }
            System.out.println(" ");
        }
        
        if(matriz1[0].length == matriz2.length) {
            int[][] matriz3 = new int[linha][coluna2];
            
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna2; j++) {
                    for (int k = 0; k < linha2; k++) {
                        matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
            
            System.out.println(" ");
            System.out.println("RESULTADO DA MULTIPLICAÇÃO:");
            
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna2; j++) {
                    System.out.print(" " + matriz3[i][j]);
                }
                System.out.println(" ");
            }
            
        } else {
            System.out.println("Não é possível realizar a multiplicação!");
        }
        
    }
}