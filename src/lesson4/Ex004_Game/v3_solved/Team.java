package lesson4.Ex004_Game.v3_solved;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Programmer> {
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
