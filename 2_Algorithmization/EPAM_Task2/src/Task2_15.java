import java.util.Random;
import java.util.Scanner;

public class Task2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Input M: ");
        int M = scanner.nextInt();
        System.out.print("Input N: ");
        int N = scanner.nextInt();
        int[][] matrix = new int[M][N];

        // Fill matrix with random int [0..50] values, print matrix and find maxValue
        int maxValue = 0;
        System.out.println("\nOriginal matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(51);
                if (matrix[i][j] > maxValue)
                    maxValue = matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print matrix
        System.out.println("\nModified matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] % 2 == 1)
                    matrix[i][j] = maxValue;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
