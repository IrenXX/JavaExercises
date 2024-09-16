package StreamWork;

import java.util.Arrays;

public class SortedMethod {
    public static void main(String[] args) {
        int[] arr = {1, 26, 83, 42, 75, 69, 107, 8, 9};
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));

        //задача - нужно чтобы остались только нечетные числа, затем делим на 3 - те числа,
        // что без остатка, и найдем сумму оставшихся чисел
        int result = Arrays.stream(arr).filter(e -> e % 2 == 1).
                map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;}
                    return e;}).
                reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);
    }
}
