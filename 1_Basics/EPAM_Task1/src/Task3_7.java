import java.util.Scanner;

public class Task3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("m: ");
            m = scanner.nextInt();
            System.out.print("n: ");
            n = scanner.nextInt();
            if (m > n)
                System.out.println("n должно быть больше m");
        } while (m > n);

        for (; m <= n; m++) {
            System.out.print("Делители " + m + ": ");
            for (int i = 2; i < m; i++)
                if ((m % i) == 0)
                    System.out.print(i + " ");
            System.out.println();
        }

    }
}
