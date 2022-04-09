public class Task1_5 {
    public static void main(String[] args) {
        int T = 100000;
        int HH = T / 3600;
        T = T - (int) HH * 3600;
        int MM = T / 60;
        T = T - (int) MM * 60;
        System.out.println(HH + "ч " + MM + "мин " + T + "с");
    }
}
