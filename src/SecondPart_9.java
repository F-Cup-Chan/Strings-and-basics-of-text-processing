public class SecondPart_9 {
    public static void main(String[] args) {
        String string = "JuSt A fEw WoRdS";
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) upperCase++;
            if (Character.isLowerCase(string.charAt(i))) lowerCase++;
        }

        System.out.println("количетсво прописных букв " + upperCase);
        System.out.println("строчных " + lowerCase);
    }
}
