import java.util.Random;
import java.util.Scanner;

public class Task1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter length of array N: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Print random array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nNew array: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
}
