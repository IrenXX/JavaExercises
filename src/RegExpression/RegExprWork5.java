package RegExpression;

public class RegExprWork5 {
    public static void main(String[] args) {
        String s1="Privet drug  Kak     dela";
        s1 = s1.replace("dela", "SQL");
        System.out.println(s1);

        s1 = s1.replaceAll(" {2,}", " ");
        System.out.println(s1);

        s1 = s1.replaceAll("\\bd\\w+","2222");
        System.out.println(s1);

        s1 = s1.replaceFirst("\\bd\\w+","2222");
        System.out.println(s1);

    }
}
