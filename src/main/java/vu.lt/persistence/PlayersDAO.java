package vu.lt.persistence;

import vu.lt.alternatives.ILevel;
import vu.lt.entities.Player;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class PlayersDAO {

    @Inject
    private EntityManager em;

    @Inject
    private ILevel level;


    public List<Player> loadAll() {
        return em.createNamedQuery("Player.findAll", Player.class).getResultList();
    }
    public void persist(Player player){
        player.setLevel(level.GameLevel());
        this.em.persist(player);
    }

    public Player findOne(Integer id){
        return em.find(Player.class, id);
    }

    public Player update(Player player){
        return em.merge(player);
    }

}