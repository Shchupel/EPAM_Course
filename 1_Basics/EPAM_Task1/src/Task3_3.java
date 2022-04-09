public class Task3_3 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 100; i > 0; i--)
            sum += Math.pow(i, 2);
        System.out.println("sum = " + sum);
    }
}
