package vu.lt.mybatis.dao;

import java.util.List;
import vu.lt.mybatis.model.PlayerGame;

public interface PlayerGameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLAYER_GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    int insert(PlayerGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLAYER_GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    List<PlayerGame> selectAll();
}