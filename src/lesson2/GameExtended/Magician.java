package lesson2.GameExtended;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.mana = Magician.r.nextInt(50, 150);
        this.maxMana = mana;
    }

    public String getInfo() {
        return String.format("%s Mana: %d",
                super.getInfo(), this.mana);
    }
}
