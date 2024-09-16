package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprWork {
    public static void main(String[] args) {
        String s =
                "Ivanov Vasiliy, Russia, Moscow, " +
                        "vIvan@gmail.com, Postcode: AA99, Phone number: +14534763598;" +
                        "Petrova Mary, Poland, Warsaw, " +
                        "mary@gmail.com, Postcode: WAW55, Phone number: +38456783567;";
//        Pattern pattern = Pattern.compile("\\+\\d{11}");//слово состоит только из 11 цифр
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");//проверка email
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
