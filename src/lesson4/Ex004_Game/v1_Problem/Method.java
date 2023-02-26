package lesson4.Ex004_Game.v1_Problem;

/**
 * Method inside to randomly create a new Programmer
 */
public class Method {

    /**
     * Builds a new Programmer
     * @param i - random number from 0 to 1
     * @return a new Junior, Middle or Senior
     */
    public static Programmer createProgrammer(int i) {
        switch (i) {
            case 0 -> {
                return new Junior();
            }
            case 1 -> {
                return new Middle();
            }
            case 2 -> {
                return new Senior();
            }
            default -> { return null; }
        }
    }
}
