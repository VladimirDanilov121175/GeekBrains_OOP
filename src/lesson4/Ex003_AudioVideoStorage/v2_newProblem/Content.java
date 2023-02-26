package lesson4.Ex003_AudioVideoStorage.v2_newProblem;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
