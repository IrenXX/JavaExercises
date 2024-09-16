package Generic;

import java.util.ArrayList;

public class GenericsWork {
    public static void main(String[] args) {
        Info<String, Integer> info1 = new Info<>("Privet", 26);
        System.out.println("Value = " + info1.getValue() + " \tID= " + info1.getId());

        ArrayList<String> list = new ArrayList();
        list.add("Privet");
        list.add("Sun");
        list.add("Ok");
        String st1 = GenMethod.getSecondElement(list);
        System.out.println(st1);
    }

    //    public void abc (Info <Integer, String> info) {
//        String s = info.getId();
//    }
    //если создадим Overriding метод abc с Info <String> только, то не будет работать - тк JVM не определяет Generics
    public void cdf(Info<Integer, String> info) {
        Integer i = info.getValue();
    }
}

class Info<T, S> {
    private T value;
    private S id;

    public Info(T value, S id) {
        this.value = value;
        this.id = id;
    }

    public T getValue() {
        return value;
    }

    public S getId() {
        return id;
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> aL) {
        return aL.get(1);
    }
}

class Parents {
    public void abc(Info<Integer, String> info) {
        String s = info.getId();
    }
}

class Child extends Parents {
    //если бы передавался только один параментр в info - то Over не смогли бы сделать
    public void abc(Info<Integer, String> info) {
        Integer i = info.getValue();
    }
}
