import java.util.Arrays;

public class FirstPart_1 {
    public static void main(String[] args) {
        String[] names = {"firstName", "anotherName", "iLostMyImagination", "andTheLastOne"};

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length(); j++) {

                if (Character.isUpperCase(names[i].charAt(j))){
                    String symbolFromWhereToReplace = "_" + names[i].charAt(j);
                    symbolFromWhereToReplace = symbolFromWhereToReplace.toLowerCase();
                    String symbolThatWillBeReplaced = String.valueOf(names[i].charAt(j));
                    names[i] = names[i].replace(symbolThatWillBeReplaced, symbolFromWhereToReplace);
                }
            }
        }

        System.out.println(Arrays.toString(names));
    }
}
