import java.util.Random;
import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter X: ");
        int X = scanner.nextInt();
        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();
        int[][] matrix = new int[Y][X];

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

        // Task algorithm
        int sum = 0, maxSum = 0, maxColumn = 0;
        for (int j = 0; j < X; j++) {
            for (int i = 0; i < Y; i++)
                sum += matrix[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j;
            }
            sum = 0;
        }
        System.out.println("MaxSum: " + maxSum + " Column: " + maxColumn + 1);
    }
}
