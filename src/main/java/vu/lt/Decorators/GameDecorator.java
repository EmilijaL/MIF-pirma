package vu.lt.Decorators;

import vu.lt.entities.Game;
import vu.lt.persistence.IGamesDAO;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.transaction.Transactional;

@Decorator
public abstract class GameDecorator implements IGamesDAO {

    @Inject @Delegate @Any
    IGamesDAO gamesDAO;

    @Transactional
    public void persist(Game game) {
        game.setName(game.getName() + " GameDecorated");
        gamesDAO.persist(game);
    }
}
