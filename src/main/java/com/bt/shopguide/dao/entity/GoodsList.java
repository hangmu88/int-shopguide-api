package com.bt.shopguide.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsList implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.id
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.title
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.small_image_url
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String smallImageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.price
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.original_price
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String originalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.discounts
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String discounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.coupons
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String coupons;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.promo_code
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String promoCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.mall_name
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String mallName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.good_source_name
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String goodSourceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.short_content
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String shortContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.url
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.publish
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private Byte publish;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.sync_time
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private Date syncTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOODS_LIST.create_time
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.id
     *
     * @return the value of GOODS_LIST.id
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.id
     *
     * @param id the value for GOODS_LIST.id
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.title
     *
     * @return the value of GOODS_LIST.title
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.title
     *
     * @param title the value for GOODS_LIST.title
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.small_image_url
     *
     * @return the value of GOODS_LIST.small_image_url
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.small_image_url
     *
     * @param smallImageUrl the value for GOODS_LIST.small_image_url
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl == null ? null : smallImageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.price
     *
     * @return the value of GOODS_LIST.price
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.price
     *
     * @param price the value for GOODS_LIST.price
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.original_price
     *
     * @return the value of GOODS_LIST.original_price
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.original_price
     *
     * @param originalPrice the value for GOODS_LIST.original_price
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice == null ? null : originalPrice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.discounts
     *
     * @return the value of GOODS_LIST.discounts
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getDiscounts() {
        return discounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.discounts
     *
     * @param discounts the value for GOODS_LIST.discounts
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setDiscounts(String discounts) {
        this.discounts = discounts == null ? null : discounts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.coupons
     *
     * @return the value of GOODS_LIST.coupons
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getCoupons() {
        return coupons;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.coupons
     *
     * @param coupons the value for GOODS_LIST.coupons
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setCoupons(String coupons) {
        this.coupons = coupons == null ? null : coupons.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.promo_code
     *
     * @return the value of GOODS_LIST.promo_code
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.promo_code
     *
     * @param promoCode the value for GOODS_LIST.promo_code
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode == null ? null : promoCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.mall_name
     *
     * @return the value of GOODS_LIST.mall_name
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getMallName() {
        return mallName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.mall_name
     *
     * @param mallName the value for GOODS_LIST.mall_name
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setMallName(String mallName) {
        this.mallName = mallName == null ? null : mallName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.good_source_name
     *
     * @return the value of GOODS_LIST.good_source_name
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getGoodSourceName() {
        return goodSourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.good_source_name
     *
     * @param goodSourceName the value for GOODS_LIST.good_source_name
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setGoodSourceName(String goodSourceName) {
        this.goodSourceName = goodSourceName == null ? null : goodSourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.short_content
     *
     * @return the value of GOODS_LIST.short_content
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getShortContent() {
        return shortContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.short_content
     *
     * @param shortContent the value for GOODS_LIST.short_content
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setShortContent(String shortContent) {
        this.shortContent = shortContent == null ? null : shortContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.url
     *
     * @return the value of GOODS_LIST.url
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.url
     *
     * @param url the value for GOODS_LIST.url
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.publish
     *
     * @return the value of GOODS_LIST.publish
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public Byte getPublish() {
        return publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.publish
     *
     * @param publish the value for GOODS_LIST.publish
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setPublish(Byte publish) {
        this.publish = publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.sync_time
     *
     * @return the value of GOODS_LIST.sync_time
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public Date getSyncTime() {
        return syncTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.sync_time
     *
     * @param syncTime the value for GOODS_LIST.sync_time
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOODS_LIST.create_time
     *
     * @return the value of GOODS_LIST.create_time
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOODS_LIST.create_time
     *
     * @param createTime the value for GOODS_LIST.create_time
     *
     * @mbggenerated Tue Sep 26 12:35:49 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}