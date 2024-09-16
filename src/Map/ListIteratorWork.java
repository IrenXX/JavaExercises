package Map;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorWork {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        ListIterator<String> listIter = states.listIterator();
        while (listIter.hasNext()) {

            System.out.println(listIter.next());
        }
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        System.out.println("---------------------");
        while (listIter.hasPrevious()) {

            System.out.println(listIter.previous());
        }
    }
}
