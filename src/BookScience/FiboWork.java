package BookScience;

import java.util.HashMap;
import java.util.Map;

public class FiboWork {
    private static int fibo2(int n) {
        if (n < 2) {
            return n;
        }
        System.out.print(n + " ");
        return fibo2(n - 1) + fibo2(n - 2);
    }

    private static int fibo3(int n) {
        Map<Integer, Integer> fibonacci = new HashMap<Integer, Integer>(Map.of(0, 0, 1, 1));
        if (!fibonacci.containsKey(n)) {
            System.out.print(">>" + n + " ");
            fibonacci.put(n, fibo3(n - 1) + fibo3(n - 2));
        }
        return fibonacci.get(n);
    }

    public static void main(String[] args) {
        System.out.println(fibo2(10));
        System.out.println(fibo3(10));
    }
}
