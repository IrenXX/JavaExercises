package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprWork6 {
    public static void main(String[] args) {
        String s1 = "67846378567298460325647;" +
                "56839582657847830230364;";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s1);
//        String myString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myString);

        while ((matcher.find())) {
            System.out.println(matcher.group(7));
        }
    }
}
