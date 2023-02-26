package lesson4.Ex004_Game.v1_Problem;

//Сценарий: соревнование двух команд программистов. Программисты есть разных уровней - джуны, миддлы и сеньоры

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex004_Game - contest of 2 teams of programmers");

//        ПРОБЛЕМА:
//        В команду можно добавлять программистов разных уровней подготовки, что логически неверно,
//        так как команда из двух джунов и одного миддла заведомо слабее команды из двух сеньоров

        Team team1 = new Team("SuperHackers");
        team1.addProgrammer(Method.createProgrammer(0));
        team1.addProgrammer(Method.createProgrammer(0));
        team1.addProgrammer(Method.createProgrammer(1));
        System.out.println(team1);

        Team team2 = new Team("DarknetSettlers");
        team2.addProgrammer(Method.createProgrammer(2));
        team2.addProgrammer(Method.createProgrammer(2));
        System.out.println(team2);

        var contest = new Contest(team1, team2);
        contest.startContest();
    }
}
