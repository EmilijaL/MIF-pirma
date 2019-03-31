package vu.lt.persistence;

import vu.lt.entities.Game;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class GamesDAO {
    @Inject
    private EntityManager em;

    public List<Game> loadAll() {
        return em.createNamedQuery("Game.findAll", Game.class).getResultList();
    }


    public void persist(Game game) {
        em.persist(game);
    }

    public void remove(Game game) {
        em.remove(game);
    }
}