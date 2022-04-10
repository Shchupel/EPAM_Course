import java.util.Random;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array N: ");
        int N = scanner.nextInt();
        System.out.print("Z: ");
        double Z = scanner.nextDouble();
        double[] arr = new double[N];

        int iterator = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - 2 * random.nextDouble();
            System.out.print(arr[i] + " ");
            if (arr[i] > Z) {
                arr[i] = Z;
                iterator++;
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\nКоличество замен: " + iterator);
    }
}
