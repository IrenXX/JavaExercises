package ReflectionWork;

public class ReflectionEmployee {
    public int id;
    public String name;
    private double salary = 1000;

    public ReflectionEmployee() {
    }

//    public ReflectionEmployee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }

    public ReflectionEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public double getSalary() {
//        return salary;
//    }
//
    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("установлена з/п: "+salary);
    }

    private void ChangeName(String newName) {
        name = newName;
        System.out.println("New Name is" + name);
    }

    public void IncreaseSalary() {
        salary *= 2;
        System.out.println("Salary" + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
