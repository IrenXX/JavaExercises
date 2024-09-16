package ArrayListWork;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWork {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ok");
        list1.add("C");
        list1.add("A");

        Iterator <String> iterator = list1.iterator();
        while (iterator.hasNext()) { //проверяет - есть ли элемент
            iterator.next(); //получает элемент из коллекции
            iterator.remove(); // выполняет действия с элементом
        }
        System.out.println(list1);
    }
}
