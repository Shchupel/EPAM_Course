import java.util.Random;
import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter X: ");
        int X = scanner.nextInt();
        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();
        int[][] matrix = new int[Y][X];
        System.out.print("Enter first column for swap (X1): ");
        int X1 = scanner.nextInt();
        X1--;
        System.out.print("Enter second column for swap (X2): ");
        int X2 = scanner.nextInt();
        X2--;

        // Fill matrix with random int [0..19] values
        for (int i = 0; i < Y; i++)
            for (int j = 0; j < X; j++)
                matrix[i][j] = random.nextInt(20);

        // Print original matrix
        System.out.println("\nOriginal matrix: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Task print
        int swap = 0;
        for (int i = 0; i < Y; i++) {
                swap = matrix[i][X1];
                matrix[i][X1] = matrix[i][X2];
                matrix[i][X2] = swap;
        }

        System.out.println("\nModified matrix: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
