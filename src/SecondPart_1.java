public class SecondPart_1 {
    public static void main(String[] args) {
        String string = "   Java  is a set of  computer  software    and specifications   developed by James Gosling" +
                " at Sun Microsystems,   which was later             acquired    by the Oracle Corporation,  that provides" + //максимально количество пробелов 13
                " a system    for  developing  application     software  and   deploying it in a   cross-platform computing environment.       ";
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < string.length(); i++) {

            if (Character.isWhitespace(string.charAt(i))){
                count++;
            } else {
                count = 0;
            }

            if (count > maxCount){
                maxCount = count;
            }
        }

        System.out.println("Максимальное количество пробелов подряд " + maxCount);
    }
}


