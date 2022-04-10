import java.util.Scanner;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        double[][] matrix = new double[N][N];

        int positiveCount = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / N);
                if (matrix[i][j] > 0)
                    positiveCount++;
            }

        // Print matrix
        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println("\nCount of positive numbers: " + positiveCount);
    }
}
