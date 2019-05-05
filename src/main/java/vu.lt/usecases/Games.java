package vu.lt.usecases;

import lombok.Getter;
import lombok.Setter;
import vu.lt.entities.Game;
import vu.lt.persistence.GamesDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Games {

    @Inject
    private GamesDAO gamesDAO;
    @Getter @Setter
    private Game gameToCreate = new Game();

    @Getter
    private List<Game> allGames;

    @PostConstruct
    public void init() {
        loadAllGames();
    }

    @Transactional
    public String createGame() {
        gamesDAO.persist(gameToCreate);
        return "index?faces-redirect=true";
    }

    private void loadAllGames() {
        allGames = gamesDAO.loadAll();
    }

}