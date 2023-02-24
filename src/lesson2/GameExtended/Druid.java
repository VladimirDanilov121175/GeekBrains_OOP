package lesson2.GameExtended;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Druid #%d", ++Druid.number),
                Druid.r.nextInt(100, 200));
        this.harmony = Druid.r.nextInt(50, 150);
        this.maxHarmony = harmony;
    }

    public String getInfo() {
        return String.format("%s Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(BaseHero target) {
        int hp = BaseHero.r.nextInt(20, 30);
        if (this.harmony >= hp) {
            target.healed(hp);
        }
    }
}
