package lesson1.Game;

import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random r;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    protected String name;
    protected int hp;
    protected int maxHp;

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s, Hp: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp += Hp > this.maxHp ? this.maxHp : this.hp + Hp;
    }

    public void Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(20, 30);
        getDamage(damage);
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
//        else die();
    }

}
