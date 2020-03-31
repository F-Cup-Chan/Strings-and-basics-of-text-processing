public class FirstPart_5 {
    public static void main(String[] args) {
        String string = "   Java  is a set of  computer  software    and specifications   developed by James Gosling" +
                " at Sun Microsystems,   which was later     acquired    by the Oracle Corporation,  that provides" +
                " a system    for  developing  application     software  and   deploying it in a   cross-platform computing environment.       ";
        boolean needChange = false;
        int num = 0;

        while (Character.isWhitespace(string.charAt(num))){ //удаляет все пробелы в начале
            string = string.substring(++num);
        }

        num = string.length() - 1;

        while (Character.isWhitespace(string.charAt(num))){ //удаляет все пробелы в конце
            string = string.substring(0, num--);
        }

        do { //удаляет все лишние пробелы в середине

            for (int i = 0; i < string.length() - 1; i++) {
                boolean current = Character.isWhitespace(string.charAt(i));
                boolean next = Character.isWhitespace(string.charAt(i+1));

                if (current && next){
                    needChange = true;
                    string = string.replace("  ", " ");
                } else {
                    needChange = false;
                }
            }
        } while (needChange);

        System.out.println(string);
    }
}
