public class SecondPart_10 {
    public static void main(String[] args) {
        String string = "Java is a set. of computer? software and! specifications developed. by James! Gosling.";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '.' || string.charAt(i) == '?' || string.charAt(i) == '!'){
                count++;
            }
        }

        System.out.println("Количество предложений " + count);
    }
}
