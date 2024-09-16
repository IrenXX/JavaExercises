package Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardWork {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>(); // в такой лист ничего нельзя добавить
        List<? extends Number> list2 = new ArrayList<Integer>();

        ArrayList <Double> doubleArrayList =  new ArrayList<>();
        doubleArrayList.add(1.0);
        doubleArrayList.add(3.14);
        doubleArrayList.add(5.6);
        System.out.println(sum(doubleArrayList));

        List<Double>list1=new ArrayList<>();
        list1.add(1.0);
        list1.add(3.14);
        list1.add(5.6);
        showList(list1);

        List<String> list3=new ArrayList<>();
        list3.add("Ok");
        list3.add("Oh no");
        list3.add("Privet");
        showList(list3);

        List<? super Number> list4=new ArrayList<Number>();

    }
    static void showList(List<?> list) {
        System.out.println("List contains " + list.size() + " elements");
        System.out.println("List: "+list);
    }
   public static double sum(List<? extends Number> list) {
        double sum=0;
        for (Number n : list) {
            sum+=n.doubleValue();
        }
        return sum;
    }
}
