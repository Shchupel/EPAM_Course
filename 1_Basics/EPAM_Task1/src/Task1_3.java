public class Task1_3 {
    public static void main(String[] args) {
        double x = Math.PI;
        double y = 0;
        double result;

        result = (Math.sin(x) + Math.cos(y))
                / (Math.cos(x) - Math.sin(y))
                * Math.tan(x * y);
        System.out.println("Result = " + result);
    }
}
