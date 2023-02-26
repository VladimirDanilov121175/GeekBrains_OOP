package lesson4.Ex004_Game.v3_solved;

import java.util.Random;

public class Contest<T extends Programmer> {
    Team<T> team1, team2;

    public Contest(Team<T> team1, Team<T> team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    /**
     * Method for running the contest in the main class
     */
    public void startContest() {
        Random r = new Random();
        String winner = r.nextInt(2) == 0 ? team1.getName() : team2.getName();

        System.out.println("The winner of the contest is " + winner);
    }
}
