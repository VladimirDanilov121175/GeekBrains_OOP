package lesson2.GameExtended;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    public static void main(String[] args) {
        int teamCount = 10;

        int magiciansCount = 0;
        int priestCount = 0;

        List<BaseHero> heroes = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            Random random = new Random();
            if (random.nextInt(0,2) == 0) {
                heroes.add(new Magician());
            } else { heroes.add(new Priest()); }
        }

        for (BaseHero hero : heroes) {
            System.out.println(hero.getInfo());
        }
    }
}
