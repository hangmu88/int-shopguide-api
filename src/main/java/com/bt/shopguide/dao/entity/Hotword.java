package com.bt.shopguide.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Hotword implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOTWORDS.id
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOTWORDS.hotword
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    private String hotword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOTWORDS.category_id
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOTWORDS.seq
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOTWORDS.create_time
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HOTWORDS.update_time
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOTWORDS.id
     *
     * @return the value of HOTWORDS.id
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOTWORDS.id
     *
     * @param id the value for HOTWORDS.id
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOTWORDS.hotword
     *
     * @return the value of HOTWORDS.hotword
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public String getHotword() {
        return hotword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOTWORDS.hotword
     *
     * @param hotword the value for HOTWORDS.hotword
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public void setHotword(String hotword) {
        this.hotword = hotword == null ? null : hotword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOTWORDS.category_id
     *
     * @return the value of HOTWORDS.category_id
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOTWORDS.category_id
     *
     * @param categoryId the value for HOTWORDS.category_id
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOTWORDS.seq
     *
     * @return the value of HOTWORDS.seq
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOTWORDS.seq
     *
     * @param seq the value for HOTWORDS.seq
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOTWORDS.create_time
     *
     * @return the value of HOTWORDS.create_time
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOTWORDS.create_time
     *
     * @param createTime the value for HOTWORDS.create_time
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HOTWORDS.update_time
     *
     * @return the value of HOTWORDS.update_time
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HOTWORDS.update_time
     *
     * @param updateTime the value for HOTWORDS.update_time
     *
     * @mbggenerated Tue Oct 10 09:25:32 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}