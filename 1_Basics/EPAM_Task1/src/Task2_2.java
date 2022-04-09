import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int min1, min2, maxmin;

        min1 = Math.min(a, b);
        min2 = Math.min(c, d);
        maxmin = Math.max(min1, min2);
        System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")} = " + maxmin);
    }
}
