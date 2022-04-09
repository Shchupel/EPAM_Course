import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > 0 && b > 0 && ((a + b) < 180)) {
            System.out.println("Triangle exist");
            if (a == 90 || b == 90 || (a + b) == 90)
                System.out.println("Right triangle");
            else
                System.out.println("not a right triangle");
        }
        else
            System.out.println("Triangle doesn\'t exist");
    }
}
