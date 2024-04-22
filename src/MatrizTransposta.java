import java.util.Arrays;
import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int colunas = sc.nextInt();
int[][] matrizA = new int[linhas][colunas];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Digite o elemento 1 da linha %d da coluna %d: " ,i+1 ,j+1);
                matrizA[i][j] = sc.nextInt();
}
        }
        //Gerando a matriz transposta
        int[][] transposta = new int[colunas][linhas];
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                transposta[i][j] = matrizA[j][i];
            }
        }

        for (int[] matriz : transposta) {
            System.out.println(Arrays.toString(matriz));
        }
        sc.close();
    }
}
