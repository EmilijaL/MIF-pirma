package vu.lt.mybatis.model;

public class Game {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GAME.ID
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GAME.NAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GAME.ID
     *
     * @return the value of PUBLIC.GAME.ID
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GAME.ID
     *
     * @param id the value for PUBLIC.GAME.ID
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GAME.NAME
     *
     * @return the value of PUBLIC.GAME.NAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GAME.NAME
     *
     * @param name the value for PUBLIC.GAME.NAME
     *
     * @mbg.generated Sun Mar 31 20:54:03 EEST 2019
     */
    public void setName(String name) {
        this.name = name;
    }
}