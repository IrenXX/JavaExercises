package MentorWork;

public class Artefact {
    int number;
    String name;
    int age;

    public Artefact(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Artefact(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Artefact(int number) {
        this.number = number;
        this.name = "Undef";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "Artefact {" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Test1 {
    public static void main(String[] args) {
//        List <Artefact> myList = new ArrayList();
//        myList.add(2);
//        list.add(new Artefact(212121));
//        list.add(new Artefact(212122,"Ацтеки"));
//        list.add(new Artefact(212123, "викинг",3));
//
//        System.out.println(list);
    }
}


