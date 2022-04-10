import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Enter N (must be even): ");
            N = scanner.nextInt();
        } while (N % 2 == 1);
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0)
                    matrix[i][j] = j + 1;
                else
                    matrix[i][j] = N - j;
            }
        }

        // Task print
        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
