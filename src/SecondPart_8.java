import java.util.ArrayList;

public class SecondPart_8 {
    public static void main(String[] args) {
        String string = "just a few words";
        ArrayList<String> words = new ArrayList<>();
        String bufferWord = "";
        int length;
        int biggestWordIndex = 0;

        for (int i = 0; i < string.length(); i++) {

            if (!Character.isWhitespace(string.charAt(i))){
                bufferWord += string.charAt(i);
            } else {
                words.add(bufferWord);
                bufferWord = "";
            }

            if (i+1 == string.length()){
                words.add(bufferWord);
            }

        }

        for (int i = 0; i < words.size(); i++) {
            length = words.get(i).length();

            if (length > words.get(biggestWordIndex).length()){
                biggestWordIndex = i;
            }
        }

        System.out.println("самое длинное слово " + words.get(biggestWordIndex));

    }
}
