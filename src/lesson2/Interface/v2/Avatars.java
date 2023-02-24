package lesson2.Interface.v2;

import lesson2.Interface.v2.Healers.Healer;
import lesson2.Interface.v2.Warriors.Warrior;

public class Avatars extends Hero implements Warrior, Healer {
    @Override
    public void healing(Hero target) {
        //...
    }

    @Override
    public void attack(Hero target) {
        // ...
    }
}
