package Generic;

public class Test {
    public static void main(String[] args) {
        Schooler schooler1 = new Schooler("Tom", 13);
        Schooler schooler2 = new Schooler("Ivan", 15);
        Student student1 = new Student("Pavel", 21);
        Student student2 = new Student("Jack", 20);

        Team<Schooler> schoolarTeam = new Team<>("Vostok");
        schoolarTeam.addNewParticipant(schooler1);
        schoolarTeam.addNewParticipant(schooler2);

        Team<Student> studentTeam = new Team<>("Pobeda");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Schooler> schoolarTeam2 = new Team<>("Mudrost");
        Schooler schooler3 = new Schooler("Den", 11);
        Schooler schooler4 = new Schooler("Gesha", 15);
        schoolarTeam2.addNewParticipant(schooler3);
        schoolarTeam2.addNewParticipant(schooler4);

        schoolarTeam.playWith(schoolarTeam2);
        //  studentTeam.playWith(schoolarTeam2);
    }
}
