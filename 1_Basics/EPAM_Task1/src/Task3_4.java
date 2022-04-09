import java.math.BigInteger;

public class Task3_4 {
    public static void main(String[] args) {
        BigInteger mul = BigInteger.valueOf(1);
        BigInteger a;
        for (int i = 1; i <= 200; i++) {
            a = BigInteger.valueOf(i);
            a = a.multiply(a);
            mul = mul.multiply(a);
        }
        System.out.println("mul = " + mul);
    }
}
