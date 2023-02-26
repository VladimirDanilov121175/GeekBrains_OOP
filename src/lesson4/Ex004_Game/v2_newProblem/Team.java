package lesson4.Ex004_Game.v2_newProblem;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String name;
    List<T> programmers;

    public Team(String name) {
        this.name = name;
        this.programmers = new ArrayList<T>();
    }

    public void addProgrammer(T programmer) {
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
