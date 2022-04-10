import java.util.Random;

public class Task2_11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[10][20];

        // Fill matrix with random int [0..15] values
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 20; j++)
                matrix[i][j] = random.nextInt(16);

        // Print matrix
        System.out.println("Original matrix: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Task print
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++)
                if (matrix[i][j] == 5)
                    count++;
            if (count >= 3)
                System.out.println("Number of line, were \"5\" was met more that 3 times: " + (i + 1));
            count = 0;
        }
    }
}
