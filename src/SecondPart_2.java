public class SecondPart_2 {
    public static void main(String[] args) {
        String string = "   Java  is a set of  computer  software    and specifications   developed by James Gosling" +
                " at Sun Microsystems,   which was later             acquired    by the Oracle Corporation,  that provides" +
                " a system    for  developing  application     software  and   deploying it in a   cross-platform computing environment.       ";

        String newString = string.replace("a", "ab");
        System.out.println(newString);
    }
}
