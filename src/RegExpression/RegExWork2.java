package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExWork2 {
    public static void main(String[] args) {
        String s = "ABC ABCD ABCGHSGYD";
        Pattern pattern = Pattern.compile("[AD]");

        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Position pattern: " + matcher.start() +
                    "\t " + matcher.group());
        }

    }
}
