public class SecondPart_4 {
    public static void main(String[] args) {
        String firstWord = "информатика";
        String secondWord;
        secondWord = String.valueOf(firstWord.charAt(7));
        secondWord += String.valueOf(firstWord.charAt(3));
        secondWord += String.valueOf(firstWord.charAt(4));
        secondWord += String.valueOf(firstWord.charAt(7));
        System.out.println(secondWord);
    }
}
