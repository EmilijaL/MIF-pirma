package vu.lt.usecases;

import lombok.Getter;
import lombok.Setter;
import vu.lt.entities.Player;
import vu.lt.persistence.PlayersDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


@Model
public class Players implements Serializable {

    @Inject
    private PlayersDAO playersDAO;

    @Getter
    @Setter
    private Player playerToCreate = new Player();

    private List<Player> allPlayers;

    @PostConstruct
    public void init() {
        loadPlayers();
    }

    private void loadPlayers() {
        this.allPlayers = playersDAO.loadAll();
    }

    public List<Player> getAllPlayers() {
        return allPlayers;
    }

    @Transactional
    public String createPlayer() {
        playersDAO.persist(playerToCreate);
        return "index?faces-redirect=true";
    }
}