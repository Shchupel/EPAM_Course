import java.util.Random;
import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Enter N (N must be even): ");
            N = scanner.nextInt();
        } while (N % 2 == 1);
        double[] arr = new double[N];

        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - 2 * random.nextDouble();
            System.out.print(" " + arr[i]);
        }

        double sum = 0;
        for (int i = 0; i != (N / 2); i++) {
            sum = arr[i] + arr[N - 1 - i];
            if (sum > max) max = sum;
            System.out.print("\nmax = " + max);
        }
    }
}
