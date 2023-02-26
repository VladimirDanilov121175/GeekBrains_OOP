package lesson4.Ex004_Game.v3_solved;

/**
 * Method inside to randomly create a new Programmer
 */
public class Method {


    public static Junior createJunior() {
        return new Junior();
    }

    public static Middle createMiddle() {
        return new Middle();
    }

    public static Senior createSenior() {
        return new Senior();
    }
}
