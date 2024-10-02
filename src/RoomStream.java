import java.util.Arrays;
import java.util.List;

//    Найти любую комнату, в которой есть человек с возрастом меньше чем minAge,
//    и вывести её номер. Использовать StreamApi

public class RoomStream {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 27);
        Person person2 = new Person("Bob", 34);
        Person person3 = new Person("Jack", 51);
        Room room1 = new Room(1, Arrays.asList(person3));
        Room room2 = new Room(2, Arrays.asList(person3));
        Room room3 = new Room(3, Arrays.asList(person2, person1));
        List<Room> rooms = Arrays.asList(room1, room2, room3);
        System.out.println(findRoom(rooms, 38));
    }

    public static int findRoom(List<Room> rooms, int minAge) {

        rooms.stream()
                .map(room -> {
                    room.getPersons().stream().filter(p -> p.getAge() < minAge);
                    return room.getNumber();
                }).findAny()
                .get();
        return 0;
//        return rooms.stream()
//                .filter(room ->
//                        room.getPersons().stream()
//                                .anyMatch(e -> e.getAge() < minAge))
//                .findAny()
//                .get()
//                .getNumber();
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Room {
    private int number;
    private List<Person> persons;

    public Room(int number, List<Person> persons) {
        this.number = number;
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public int getNumber() {
        return number;
    }
}