import java.util.Random;
import java.util.Scanner;

public class Task2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Input M: ");
        int M = scanner.nextInt();
        int N;
        do {
            System.out.print("Input N (N must be less than M or equal): ");
            N = scanner.nextInt();
        } while (N > M);
        int[][] matrix = new int[M][N];

        int countOfOnes = 0, randomIndex = 0;
        for (int j = 0; j < N; j++) {
                countOfOnes = j + 1;
                while (countOfOnes != 0) {
                    randomIndex = random.nextInt(M);
                    if (matrix[randomIndex][j] != 1) {
                        matrix[randomIndex][j] = 1;
                        countOfOnes--;
                    }
                }
        }

        // Print matrix
        System.out.println("\nOriginal matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
