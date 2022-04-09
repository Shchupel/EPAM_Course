public class Task3_6 {
    public static void main(String[] args) {
        char charsSigns  = '\u0000';
        for (int charsNumber = 0; charsNumber < 65535; charsNumber++)
            System.out.println("Символ: " + charsSigns++ + "  ASCII номер: " + charsNumber);
    }
}
