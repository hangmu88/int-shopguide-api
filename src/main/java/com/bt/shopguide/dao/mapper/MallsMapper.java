package com.bt.shopguide.dao.mapper;

import com.bt.shopguide.dao.entity.Malls;

import java.util.List;

public interface MallsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MALLS
     *
     * @mbggenerated Wed Sep 27 17:49:16 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MALLS
     *
     * @mbggenerated Wed Sep 27 17:49:16 CST 2017
     */
    int insert(Malls record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MALLS
     *
     * @mbggenerated Wed Sep 27 17:49:16 CST 2017
     */
    int insertSelective(Malls record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MALLS
     *
     * @mbggenerated Wed Sep 27 17:49:16 CST 2017
     */
    Malls selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MALLS
     *
     * @mbggenerated Wed Sep 27 17:49:16 CST 2017
     */
    int updateByPrimaryKeySelective(Malls record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MALLS
     *
     * @mbggenerated Wed Sep 27 17:49:16 CST 2017
     */
    int updateByPrimaryKey(Malls record);

    List<Malls> selectAll();
}