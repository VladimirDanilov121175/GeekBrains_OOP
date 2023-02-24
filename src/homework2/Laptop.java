package homework2;

public class Laptop extends Item {
    private String os;
    private int rom;
    private int hdd;
    private int screenDiagonal;
    private String screenResolution;
    private String targetOfUse;

    /**
     * Constructor for Laptop instance
     */
    public Laptop(String os,
                  String brand, String model,
                  int rom, int hdd,
                  int screenDiagonal, String screenResolution,
                  String targetOfUse) {
        super(brand, model);
        this.os = os;
        this.rom = rom;
        this.hdd = hdd;
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;
        this.targetOfUse = targetOfUse;
        this.summary = String.format("""                                        
                        %s
                        Операционная система: %s
                        HDD: %d, ROM: %d, экран %d" %s
                        Рекомендуемое применение: %s
                        """,
                super.summary,
                this.os,
                this.hdd, this.rom, this.screenDiagonal, this.screenResolution,
                this.targetOfUse);
    }
}
