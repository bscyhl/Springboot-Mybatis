package com.example.demo334.entity;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zhanyl_test.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zhanyl_test.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhanyl_test.id
     *
     * @return the value of zhanyl_test.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhanyl_test.id
     *
     * @param id the value for zhanyl_test.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zhanyl_test.name
     *
     * @return the value of zhanyl_test.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zhanyl_test.name
     *
     * @param name the value for zhanyl_test.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}