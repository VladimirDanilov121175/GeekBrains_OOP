package lesson4.Ex004_Game.v3_solved;

//Сценарий: соревнование двух команд программистов. Программисты есть разных уровней - джуны, миддлы и сеньоры

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex004_Game - contest of 2 teams of programmers");

//        Проблема версии v1 решена: в команды можно добавлять только программистов одного уровня подготовки
//        Соревнования также можно проводить только между командами одного уровня подготовки

        Team<Junior> team1 = new Team<Junior>("SuperHackers");
        team1.addProgrammer(Method.createJunior());
        team1.addProgrammer(Method.createJunior());
//        team1.addProgrammer(Method.createMiddle()); // добавить миддла в команду джунов стало нельзя
        System.out.println(team1);

        Team<Senior> team2 = new Team<>("DarknetSettlers");
        team2.addProgrammer(Method.createSenior());
        team2.addProgrammer(Method.createSenior());
        System.out.println(team2);

        Team<Junior> team3 = new Team<>("AwesomeJuniors");
        team3.addProgrammer(Method.createJunior());
        team3.addProgrammer(Method.createJunior());
        System.out.println(team3);

//        var contest = new Contest<Junior>(team1, team2); // нельзя провести соревнование между командами разного уровня подготовки
        var contest = new Contest<Junior>(team1, team3);
        contest.startContest();


        // region Проблема v2 решена можно создавать команды только класса Programmer
//        Team<String> stringTeam1 = new Team<String>("stringTeam1");
//        Team<String> stringTeam2 = new Team<String>("stringTeam2");
//        var stringContest = new Contest<String>(stringTeam1, stringTeam2);
//        stringContest.startContest();
        // endregion
    }
}
