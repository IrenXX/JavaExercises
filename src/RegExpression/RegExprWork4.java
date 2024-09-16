package RegExpression;

import java.util.regex.Pattern;

public class RegExprWork4 {
    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + "\nIP is OK? " + Pattern.matches(regex,ip));
    }

    public static void main(String[] args) {
        String ip1 = "254.134.23.230";
        String ip2 = "264.134.23.230";
        RegExprWork4 regEx = new RegExprWork4();
        regEx.checkIP(ip1);
        regEx.checkIP(ip2);

    }
}
