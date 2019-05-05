package vu.lt.persistence;
import vu.lt.entities.Game;

import java.util.List;
public interface IGamesDAO {

    List<Game> loadAll();
    void persist(Game game);
}
