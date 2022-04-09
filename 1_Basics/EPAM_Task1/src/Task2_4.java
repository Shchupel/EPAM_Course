import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int A = scanner.nextInt();
        System.out.print("B: ");
        int B = scanner.nextInt();

        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.print("z: ");
        int z = scanner.nextInt();
        System.out.println();

        if (x <= A && y <= B || x <= B && y <= A
         || y <= A && z <= B || y <= B && z <= A
         || x <= A && z <= B || x <= B && z <= A)
            System.out.println("Кирпич пройдет");
        else
            System.out.println("Не пройдет");
    }
}
