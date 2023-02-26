package lesson4.Ex003_AudioVideoStorage.v1_problem;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    public List<Content> repo;

    public Repository(){
        this.repo = new ArrayList<Content>();
    }

    public void addToRepository(Content content) {
        this.repo.add(content);
    }
}
