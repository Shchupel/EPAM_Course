import java.util.Random;
import java.util.Scanner;

public class Task1_9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array N: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Print random array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        // Print sorted array
        System.out.print("\nSorted Array: ");
        for (int value : arr) System.out.print(value + " ");

        int counter = 0, commonNumber = arr[0], times = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    counter++;
            }
            if (times < counter || times == counter && commonNumber > arr[i]) {
                commonNumber = arr[i];
                times = counter;
            }
            counter = 0;
        }
        System.out.print("\nСамое встречаемое наименьшее число: " + commonNumber + "\nВстретилось раз(а): " + times);
    }
}
