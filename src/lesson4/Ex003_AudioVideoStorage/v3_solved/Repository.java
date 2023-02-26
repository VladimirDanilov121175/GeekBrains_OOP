package lesson4.Ex003_AudioVideoStorage.v3_solved;

import java.util.ArrayList;
import java.util.List;

public class Repository<M extends Content> {
    public List<M> repo;

    public Repository() {
        this.repo = new ArrayList<M>();
    }

    public void addToRepository(M content) {
        this.repo.add(content);
    }
}
