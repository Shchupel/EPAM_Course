import java.util.Scanner;

public class Task3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int A = scanner.nextInt();
        System.out.print("B: ");
        int B = scanner.nextInt();

        int bClone;
        while (A > 0) {
            bClone = B;
            while (bClone > 0) {
                if (bClone % 10 == A % 10)
                    System.out.println("\tОбщяя цифра: " + A % 10);
                bClone /= 10;
            }
            A /= 10;
        }
    }
}
