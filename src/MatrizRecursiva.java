import java.util.Scanner;

public class MatrizRecursiva {

    public static int[][] criarMatriz(int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Insira o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void exibirMatrizRecursiva(int[][] matriz, int linha) {
        if (linha >= matriz.length) {
            return;
        }

        for (int valor : matriz[linha]) {
            System.out.print(valor + " ");
        }
        System.out.println();
        exibirMatrizRecursiva(matriz, linha + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Insira o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = criarMatriz(linhas, colunas);

        exibirMatrizRecursiva(matriz, 0);
    }
}
