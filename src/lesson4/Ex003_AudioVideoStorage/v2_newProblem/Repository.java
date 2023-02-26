package lesson4.Ex003_AudioVideoStorage.v2_newProblem;

import java.util.ArrayList;
import java.util.List;

public class Repository<M> {
    public List<M> repo;

    public Repository() {
        this.repo = new ArrayList<M>();
    }

    public void addToRepository(M content) {
        this.repo.add(content);
    }
}
