package vu.lt.rest;

import lombok.*;
import vu.lt.entities.Player;
import vu.lt.entities.Team;
import vu.lt.persistence.PlayersDAO;
import vu.lt.persistence.TeamsDAO;
import vu.lt.rest.contracts.PlayerDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/players")
public class PlayersController {

    @Inject
    @Setter @Getter
    private PlayersDAO playersDAO;

    @Inject
    @Setter @Getter
    private TeamsDAO teamsDAO;



    @GET
    public List<Player> getAll() {
        return playersDAO.loadAll();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") final Integer id) {
        Player player = playersDAO.findOne(id);
        if (player == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        PlayerDto playerDto = new PlayerDto();
        playerDto.setName(player.getName());
        playerDto.setJerseyNumber(player.getJerseyNumber());
        playerDto.setTeamName(player.getTeam().getName());
        playerDto.setLevel(player.getLevel());
        playerDto.setTeamId(player.getTeam().getId());

        return Response.ok(playerDto).build();
    }
    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(
            @PathParam("id") final Integer playerId,
            PlayerDto playerData) {
        try {
            Player existingPlayer = playersDAO.findOne(playerId);
            if (existingPlayer == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            existingPlayer.setName(playerData.getName());
            existingPlayer.setJerseyNumber(playerData.getJerseyNumber());
            playersDAO.update(existingPlayer);
            return Response.ok().build();
        } catch (OptimisticLockException ole) {
            return Response.status(Response.Status.CONFLICT).build();
        }

    }

    @Path("/create")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Player create(PlayerDto playerData) {
        Player player = new Player();
        player.setName(playerData.getName());
        player.setJerseyNumber(playerData.getJerseyNumber());
        Team existingTeam = teamsDAO.findOne(playerData.getTeamId());
        if (existingTeam != null) {
            player.setTeam(existingTeam);
        }
        playersDAO.persist(player);
        return player;
    }

}