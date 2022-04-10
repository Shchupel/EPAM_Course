import java.util.Random;
import java.util.Scanner;

public class Task2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        // Fill matrix with random int [0..19] values
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = random.nextInt(20) - 5;

        // Print matrix
        System.out.println("Original matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Task print
        System.out.println("Diagonal of positive numbers: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (i == j && matrix[i][j] > 0)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}
