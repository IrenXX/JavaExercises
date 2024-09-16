package StreamWork;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectGroup {
    public static void main(String[] args) {
        Stream<PhoneWork> phoneStream = Stream.of(
                new PhoneWork("iPhone X", "Apple", 600),
                new PhoneWork("Pixel 2", "Google", 500),
                new PhoneWork("iPhone 8", "Apple", 450),
                new PhoneWork("Galaxy S9", "Samsung", 440),
                new PhoneWork("Galaxy S8", "Samsung", 340));

        //группировки groupingBy
        // по компании + подсчет кол-ва элементов в каждой группе
//        Map <String,Long> phoneByCompany = phoneStream.collect(
//                Collectors.groupingBy(PhoneWork::getCompany,
//                          Collectors.counting()));
//        for (Map.Entry<String, Long> entry : phoneByCompany.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//          }

        //группировка по компании и затем цене
//        Map<String, Integer> phoneSum = phoneStream.collect(
//                Collectors.groupingBy(PhoneWork::getCompany,
//                        Collectors.summingInt(PhoneWork::getCost)));
//        for (Map.Entry<String, Integer> entry : phoneSum.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//        Map<String, Optional<PhoneWork>> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(PhoneWork::getCompany,
//                        Collectors.minBy(Comparator.comparing(PhoneWork::getCost))));
//        for (Map.Entry<String, Optional<PhoneWork>> item : phonesByCompany.entrySet()) {
//            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
//        }
//
//        Map <String, List<PhoneWork>> phoneStreamMap = phoneStream.collect(
//                //Collectors.groupingBy(PhoneWork::getCompany));
//                Collectors.groupingBy(p->p.getCompany()));
//        for (Map.Entry<String, List<PhoneWork>> entry : phoneStreamMap.entrySet()) {
//            System.out.println(entry.getKey());
//            for (PhoneWork phoneWork : entry.getValue()) {
//                System.out.println(phoneWork.getName());
//            }
//         System.out.println();
//        }


        //группировка partitioningBy
//        Map <Boolean, List<PhoneWork>> phoneGroup = phoneStream.collect(
//                Collectors.partitioningBy(p->p.getCompany()=="Apple"));
//        for (Map.Entry<Boolean, List<PhoneWork>> entry : phoneGroup.entrySet()) {
//            System.out.println(entry.getKey());
//            for (PhoneWork work : entry.getValue()) {
//                System.out.println(work.getName());
//            }
//            System.out.println();
//        }

        //группировка и суммирование объектов
//        Map<String, IntSummaryStatistics> priceSummary = phoneStream.collect(
//                Collectors.groupingBy(PhoneWork::getCompany,
//                        Collectors.summarizingInt(PhoneWork::getCost)));
//        for (Map.Entry<String, IntSummaryStatistics> entry : priceSummary.entrySet()) {
//            System.out.println(entry.getKey() + ": summ cost = " + entry.getValue().getSum()+ " "+entry.getValue());

//        IntSummaryStatistics intStatistics = phoneStream.collect(Collectors.summarizingInt(PhoneWork::getCost));
//        System.out.println(intSummaryStatistics);

//        Map <String, List<String>> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(PhoneWork::getCompany,
//                        mapping(PhoneWork::getName, toList())));
//        System.out.println(phonesByCompany);


//        for (Map.Entry<String, List<String>> entry : phonesByCompany.entrySet()) {
//            System.out.println(entry.getKey());
//            for (String phone : entry.getValue()) {
//                System.out.println(phone);
//            }
//        }

        //объединение строк Joining
//        String join = phoneStream.map(PhoneWork::getName).collect(Collectors.joining(", "));
//        System.out.println(join);

        //свертка значений int либо нахождение самого макс знач-я
//        Integer collect = phoneStream.collect(Collectors.reducing(0, PhoneWork::getCost, (x, y) -> x + y));
//        Optional<PhoneWork> collect = phoneStream.collect(Collectors.reducing((x, y) -> x.getCost() > y.getCost() ? x : y));
//        System.out.println(collect);

        //свод значений int/long и тд
//        Double total = phoneStream.collect(Collectors.averagingInt(PhoneWork::getCost));
//        System.out.println(total);

        //группировка с перегруженным методои groupingBy
        System.out.println(phoneStream
                .collect(groupingBy(PhoneWork::getCompany,
                        filtering(cost -> cost.getCost() > 450,
                                toList()))));
    }
}

class PhoneWork {
    private String name;
    private int cost;
    private String company;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", company='" + company + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getCompany() {
        return company;
    }

    public PhoneWork(String name, String company, int cost) {
        this.name = name;
        this.cost = cost;
        this.company = company;
    }
}
