public class SecondPart_7 {
    public static void main(String[] args) {
        String string = "aa f f cqr rrd qq qqq aa";
        String stringWithoutSpaces = "";
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) != ' '){
                stringWithoutSpaces += string.charAt(i);
            }
        }

        stringWithoutSpaces.chars().distinct().forEach(c -> newString.append((char) c));  

        System.out.println(newString);
    }
}
