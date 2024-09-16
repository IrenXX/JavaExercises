package ArrayListWork;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorWork {
    public static void main(String[] args) {
        String s = "grtgf";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIIterator = list.listIterator(list.size());
        boolean isPalyndrome = true;
        while (iterator.hasNext() && reversIIterator.hasPrevious()) {
            if (iterator.next() != reversIIterator.previous()) {
                isPalyndrome = false;
                break;
            }
        }
        System.out.println(isPalyndrome);
    }
}

