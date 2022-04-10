import java.util.Random;
import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array N: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        int bound = 20;
        int min = bound;
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
            System.out.print(arr[i] + " ");
            if (arr[i] < min)
                min = arr[i];
        }

        int countOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                countOfMin++;
        }
        N -= countOfMin;
        int[] newArr = new int[N];
        System.out.print("\nArray: ");
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            while (arr[j] == min)
                j++;
            newArr[i] = arr[j];
            System.out.print(newArr[i] + " ");
            j++;
        }
    }
}
