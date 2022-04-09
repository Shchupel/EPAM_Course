import java.text.DecimalFormat;

public class Task1_4 {
    public static void main(String[] args) {
        double R = 123.456;
        int left = (int) R;
        String right = String.format("%.0f", (R - left) * 1000);
        String Result = right + "." + left;
        double dResult = Double.parseDouble(Result);
        System.out.println(dResult);


    }
}
