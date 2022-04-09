import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3)
            System.out.println("Точки лежат на одной прямой");
        else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println("Точки лежат на одной прямой");
        else
            System.out.println("Не лежат");
    }
}
