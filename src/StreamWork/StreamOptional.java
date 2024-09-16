package StreamWork;

import java.util.*;

public class StreamOptional {
    public static void main(String[] args) {
        List<String> phone = new ArrayList<>();
        phone.addAll(Arrays.asList(new String[]
                {"iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                        "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                        "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                        "Lenovo S 850"}));
//        int pageSize =3;
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Enter the page");
//            int page= scanner.nextInt();
//            if(page<1){break;}
//            phone.stream()
//                    .skip((page-1)*pageSize)
//                    .limit(pageSize).
//                    forEach(System.out::println);
//            System.out.println("------------------------------");
//        }
//        scanner.close();
        System.out.println(phone.stream().count());//кол-во эл в потоке
        System.out.println(phone.stream().filter(x -> x.length() > 10).count());

        Optional<String> first = phone.stream().findFirst();
        System.out.println(first.get());//1-й эл в потоке
//        Optional<String> any = phone.stream().findAny();
//        System.out.println(any.get());
//        boolean anyMatch = phone.stream().anyMatch(x -> x.length() > 10);//есть ли в потоке строка длинной > 10 символов
//        System.out.println(anyMatch);
//        boolean allMatch = phone.stream().allMatch(x -> x.length() > 10);//все ли строки имеют длину > 10 символов
//        System.out.println(allMatch);
//        boolean noneMatch = phone.stream().noneMatch(x -> x=="iPhone S");//НЕТ ЛИ в потоке строки "iPhone 6 S"
//        System.out.println(noneMatch);//нет - true
        System.out.println("---------------------");
        Optional<String> max = phone.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());

        System.out.println("-----------------------");
        List<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, -10));
        Optional<Integer> min = array.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());
        Optional<Integer> max1 = array.stream().max(Integer::compare);
        System.out.println(max1.get());
    }
}
