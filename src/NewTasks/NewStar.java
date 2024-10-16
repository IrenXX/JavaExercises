package NewTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Дана группа людей из K человек, и эти люди могут знать друг друга, необязательно взаимно.
Среди них есть знаменитость.
 Знаменитость — это человек, который не знает никого в компании, зато каждый из компании знает его.
Изначально мы не владеем информацией о том, кто кого знает, но мы можем спросить у каждого участника,
 знает ли он других людей из группы. Нужно определить знаменитость, используя минимальное количество
 вопросов.
 */
public class NewStar {
    public static void main(String[] args) {

        String string= "Hello Word";
        List<String> list = new ArrayList<>(List.of("Pi", "Fi"));
        Collections.fill(list, string);
        System.out.println(list);

    }
}

class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    People findCelebrity(People[] people) {
        int l = 0, r = people.length - 1;
        while (l != r) {
            if (people[l].knows(people[r])) {
                l++;
            } else {
                r--;
            }
            for (int i = 0; i < l; i++) {
                if (i != l && (!people[i].knows(people[l])
                        || people[l].knows(people[i]))) {
                    return null;
                }
            }
        }
        return people[l];
    }

    private boolean knows(People person) {
        return true;
    }
}