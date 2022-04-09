import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        System.out.println("Input е");
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();

        int n = 0;
        double sum = 0;
        System.out.println("Print a series of common member series: ");
        for (int i = 0; i <= 10; i++) {
            ++n;
            System.out.print("\n");
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum += a;
            System.out.printf(" sum is %f", sum);
        }
    }
}
