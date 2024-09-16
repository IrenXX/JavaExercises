package RegExpression;

import java.util.Arrays;

public class RegExprWork3 {
    public static void main(String[] args) {
        String s =
                "Ivanov Vasiliy, Russia, Moscow, " +
                        "vIvan@gmail.com, Postcode: AA99, Phone number: +14534763598;" +
                        "Petrova Mary, Poland, Warsaw, " +
                        "mary@gmail.com, Postcode: WAW55, Phone number: +38456783567;";
        String s2 = "mary@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
