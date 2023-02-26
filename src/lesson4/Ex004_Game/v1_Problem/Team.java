package lesson4.Ex004_Game.v1_Problem;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    List<Programmer> programmers;

    public Team(String name) {
        this.name = name;
        this.programmers = new ArrayList<Programmer>();
    }

    public void addProgrammer(Programmer programmer) {
        this.programmers.add(programmer);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nTeam '" + name + "'\n" + programmers;
    }
}
