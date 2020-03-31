public class FirstPart_4 {
    public static void main(String[] args) {
        String string = "asf32hh2sf234ghj9k839999994h995";
        int count = 0;

        for (int i = 1; i < string.length(); i++) {
            boolean current = Character.isDigit(string.charAt(i));
            boolean previous = Character.isDigit(string.charAt(i-1));
            boolean next;

            try {
                next = Character.isDigit(string.charAt(i+1));
            } catch (StringIndexOutOfBoundsException e){
                next = false;
            }

            if (previous && current && !next){
                count++;
            }
        }

        System.out.println(count);
    }
}
