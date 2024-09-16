package Records;

public class RecordsClass {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 36);
        System.out.println(tom);
        Person bob = new Person("Bob", -21);
        System.out.println(bob);
        Person tomas = new Person("Tom", "Smith",36);
        System.out.println(tomas.name());
        System.out.println(tomas.equals(tom));

    }
}
record Person (String name, int age){
    static int minAge;
    static{
        minAge = 18;
        System.out.println("Static initializer");
    }

    Person{
        if (age<0 || age>110){
            age=18;
        }
    }
    //переопределяем конструктор Person
    Person(String firstName, String lastName, int age){
        this(firstName + " " + lastName, age);//тут идет вызов канонического конструктора
    }

    //переопределяем мотоды
    @Override
    public String name() {
        return "Mister "+name;
    }

}
//class Person {
//    private final String name;
//    private final int age;
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    String name() {
//        return name;
//    }
//
//    int age() {
//        return age;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Person)) return false;
//        Person other = (Person) o;
//        return other.name == name && other.age == age;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Person[name=%s, age=%d]", name, age);
//    }
//}
