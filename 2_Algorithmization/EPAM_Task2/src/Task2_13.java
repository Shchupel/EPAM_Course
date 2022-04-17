import java.util.Random;

public class Task2_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[10][20];

        // Fill matrix with random int [0..15] values
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 20; j++)
                matrix[i][j] = random.nextInt(16);

        // Print matrix
        System.out.println("\nOriginal matrix: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Matrix column bubble sort
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 10 - 1; i++)
                for (int k = 0; k < 10 - i - 1; k++)
                    if (matrix[k][j] > matrix[k + 1][j]) {
                        int swap = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = swap;
                    }
        }

        // Ascending print
        System.out.println("\nAscending matrix print: ");
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Descending print
        System.out.println("\nDescending matrix print: ");
        for (int i = 9; i >= 0; --i) {
            for (int j = 19; j >= 0; --j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
