public class Task1_2 {
    public static void main(String[] args) {
        double b = 2;
        double a = 3;
        double c = 4;
        double result;

        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))
                / (2 * a)
                - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Result = " + result);
    }
}
