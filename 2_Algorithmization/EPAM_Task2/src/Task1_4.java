import java.util.Random;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array N: ");
        int N = scanner.nextInt();
        double[] arr = new double[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - 2 * random.nextDouble();
            System.out.print(arr[i] + " ");
        }

        double min = 100, max = 0;
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("\nmin = " + min + "  with index: " + minIndex
                         + "\nmax = " + max + "  with index: " + maxIndex);

        double temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        for (double v : arr) System.out.print(v + " ");
    }
}
