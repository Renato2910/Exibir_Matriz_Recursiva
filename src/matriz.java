import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de linhas: ");
        int linhas = scanner.nextInt();

        System.out.println("Digite o numero de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
