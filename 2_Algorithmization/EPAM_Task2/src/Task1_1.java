import java.util.Random;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array N: ");
        int N = scanner.nextInt();
        System.out.print("K: ");
        int K = scanner.nextInt();
        int[] arr = new int[N];

        int sum = 0;
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
            if (arr[i] % K == 0)
                sum += arr[i];
        }
        System.out.println("\nsum: " + sum);
    }
}
