package LambdaWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemovaIfW {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("Privet");
        aList.add("Public");
        aList.add("Poka");
//        aList.removeIf(s->s.length()>4);
        System.out.println(aList);
        Predicate<String> pr =s->s.length()>4;
        aList.removeIf(pr);
    }
}
