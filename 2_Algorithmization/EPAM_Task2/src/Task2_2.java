import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        // Fill matrix with random int [0..19] values
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = random.nextInt(20);

        // Print matrix
        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Task print
        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (i == j)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}
