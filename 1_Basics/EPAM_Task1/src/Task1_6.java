import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        // Проверка принадлежит ли X отрезку [-2; 2] и принадлежит ли Y [-1.5; 0]
        boolean isIncluded1 = x >= -2 && x <= 2 && y <= 0 && y >= -1.5;
        // Проверка принадлежит ли X отрезку [-1; 1] и принадлежит ли Y [0; 2]
        boolean isIncluded2 = x >= -1 && x <= 1 && y <= 2 && y >= 0;
        // Если точка приналежит хотя бы одной под-области, то она принадлежит всей области
        System.out.println(isIncluded1 || isIncluded2);
    }
}
