package lesson4.Ex004_Game.v2_newProblem;

import java.util.Random;
import java.util.UUID;

public abstract class Programmer {
    protected String name;
    protected int age;

    public Programmer(){
        Random rand = new Random();
        String uidName = UUID.randomUUID().toString().substring(0, 5);
        this.name = uidName;
        this.age = rand.nextInt(18, 50);
    }

    @Override
    public String toString() {
        return String.format("""
                \nName: %s, age: %d, level: %s""", name, age, this.getClass().getSimpleName());
    }
}
