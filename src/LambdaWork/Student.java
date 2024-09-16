package LambdaWork;

class Student {
    String name;
    int age;
    int cource;

    public Student(String name, int age, int cource) {
        this.name = name;
        this.age = age;
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cource=" + cource +
                '}';
    }
}
