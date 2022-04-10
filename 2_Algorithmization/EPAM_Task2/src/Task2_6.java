import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Enter N (must be even): ");
            N = scanner.nextInt();
        } while (N % 2 == 1);
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (j >= i && j < N - i)
                    matrix[i][j] = 1;
                else if (j <= i && j >= N - i - 1)
                    matrix[i][j] = 1;


        // Print matrix
        System.out.println("Matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
