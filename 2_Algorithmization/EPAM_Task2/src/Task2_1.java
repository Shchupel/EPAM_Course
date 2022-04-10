import java.util.Random;
import java.util.Scanner;

public class Task2_1 {
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

        // Print matrix
        System.out.println("Matrix: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Print for task
        System.out.println("Matrix: ");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if ((j % 2 == 1) && (matrix[0][j] > matrix[Y - 1][j]))
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
