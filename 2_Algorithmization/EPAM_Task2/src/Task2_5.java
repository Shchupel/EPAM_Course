import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Enter N (must be even): ");
            N = scanner.nextInt();
        } while (N % 2 == 1);
        int[][] matrix = new int[N][N];

        // Task initialization
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == N - i)
                    break;
                matrix[i][j] = i + 1;
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
