import java.util.Random;
import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();
        double[] arr = new double[N];

        double sum = 0;
        boolean isPrime;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - 2 * random.nextDouble();
            for (int j = 2; j < N; j++) {
                isPrime = true;
                for (int k = 2; k <= j / k; k++)
                    if ((j % k) == 0) isPrime = false;
                if (isPrime) {
                    sum += arr[i];
                    System.out.print(sum + "  ");
                }
            }
        }

    }
}
