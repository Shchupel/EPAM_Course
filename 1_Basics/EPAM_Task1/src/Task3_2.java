import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter h: ");
        double h = scanner.nextDouble();

        for (double i = a; i <= b; i += h)
            if (i > 2) System.out.println("\n y = " + i);
            else System.out.println("\ny = " + (-i));;
    }
}
