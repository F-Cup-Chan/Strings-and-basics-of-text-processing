public class SecondPart_6 {
    public static void main(String[] args) {
        String string = "Java is a set of computer software and specifications developed by James Gosling" +
                " at Sun Microsystems, which was later acquired by the Oracle Corporation, that provides" +
                " a system for developing application software and deploying it in a cross-platform computing environment.";
        String newString = "";
        for (int i = 0; i < string.length(); i++) {

            newString += String.valueOf(string.charAt(i));
            newString += String.valueOf(string.charAt(i));

        }

        System.out.println(newString);
    }
}
