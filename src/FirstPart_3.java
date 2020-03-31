public class FirstPart_3 {
    public static void main(String[] args) {
        String string = "7dfgdfg5g4jh356hf3gg45j79f67fh632"; //тут 16 цифр(я посчитал)
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
