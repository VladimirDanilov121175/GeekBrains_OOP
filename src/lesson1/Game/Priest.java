package lesson1.Game;

public class Priest extends BaseHero {
    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Priest #%d", ++Priest.number),
                Priest.r.nextInt(100, 200));
        this.elixir = Priest.r.nextInt(80, 200);
        this.maxElixir = elixir;
    }

    public String getInfo() {
        return String.format("%s Elixir: %d",
                super.getInfo(), this.elixir);
    }
}
