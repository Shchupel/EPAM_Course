import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        double result;

        if (x <= 3)
            result = Math.pow(x, 2) - 3 * x + 9;
        else
            result = Math.pow(Math.pow(x, 3) + 6 , -1);
        System.out.println("Result = " + result);
    }
}
