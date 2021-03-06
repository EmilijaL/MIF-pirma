package vu.lt.mybatis.dao;

import java.util.List;
import vu.lt.mybatis.model.Game;

public interface GameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    int insert(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    Game selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    List<Game> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    int updateByPrimaryKey(Game record);
}