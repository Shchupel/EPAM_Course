import java.util.Random;
import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter X: ");
        int X = scanner.nextInt();
        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();
        int[][] matrix = new int[Y][X];
        System.out.print("Enter line for print (k): ");
        int k = scanner.nextInt();      // Line for print
        System.out.print("Enter column for print (p): ");
        int p = scanner.nextInt();      // Column for print

        // Fill matrix with random int [0..19] values
        for (int i = 0; i < Y; i++)
            for (int j = 0; j < X; j++)
                matrix[i][j] = random.nextInt(20);

        // Print matrix
        System.out.println("Matrix: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Task print
        System.out.println("\nMatrix: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++)
                if ((i == k - 1) || (j == p - 1))
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("   ");
            System.out.println();
        }
    }
}
