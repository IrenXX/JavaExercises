package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends GenericExtends> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("Added New Participant " + participant.getName() + " to Team " + name);
    }

    public void playWith(Team<T> team) {
        String winner;
        Random rand = new Random();
        int index = rand.nextInt(2);
        if (index == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("Winner is " + winner);
    }
}
