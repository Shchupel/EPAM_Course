import java.util.Random;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array N: ");
        int N = scanner.nextInt();
        double[] arr = new double[N];

        int countPositive = 0, countNegative = 0, o = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - 2 * random.nextDouble();
            System.out.print(arr[i] + " ");
            if (arr[i] > 0) countPositive++;
            else if (arr[i] < 0) countNegative++;
            else o++;
        }

        System.out.println("\nPositive numbers: " + countPositive
                         + "\nNegative numbers: " + countNegative
                         + "\nZero\'s: " + o);
    }
}
