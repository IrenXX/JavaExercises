package Generic;

public abstract class GenericExtends {
    private String name;
    private  int age;

    GenericExtends(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
