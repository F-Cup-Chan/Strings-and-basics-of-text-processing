public class SecondPart_3 {
    public static void main(String[] args) {
        String word = "level";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equals(reversedWord)){
            System.out.println("слово " + word + " является палиндромом");
        } else {
            System.out.println("слово " + word + " не является палиндромом");
        }
    }
}
