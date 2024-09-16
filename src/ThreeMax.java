
//В списке чисел найти 3 максимальных

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThreeMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(34);//3
        list.add(56);//2
        list.add(14);
        list.add(23);
        list.add(76);//1
        //первый вариант решения
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.print("\nSecond var: ");
        //второй вариант решения
        for (int i = 0; i < 3; i++) {
            if (list.size() < 3) return;
            int max = list.stream().max(Comparator.naturalOrder()).get();
            list.removeIf(next -> max == next);
//            for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
//                Integer next = iterator.next();
//                if (max==next){
//                iterator.remove();
//                }
//            }
            System.out.print(max+" ");
        }
    }
}
