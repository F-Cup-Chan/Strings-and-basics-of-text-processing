public class SecondPart_5 {
    public static void main(String[] args) {
        String string = "Java is a set of computer software and specifications developed by James Gosling" +
                " at Sun Microsystems, which was later acquired by the Oracle Corporation, that provides" +
                " a system for developing application software and deploying it in a cross-platform computing environment.";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println("Количество букв а = " + count);
    }
}
