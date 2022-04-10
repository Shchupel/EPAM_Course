import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array N: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            if (arr[i] > i)
            System.out.print(arr[i] + " ");
        }
    }
}
