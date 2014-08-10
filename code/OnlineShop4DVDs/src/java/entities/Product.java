/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Jun
 */
public class Product {
    long productID;
    String productName;
    Double productPrice;
    Date productReleaseDate;
    String productAvatar;
    String productURL;
    String productDesc;

    public Product() {
    }

    public Product(long productID, String productName, Double productPrice, Date productReleaseDate, String productAvatar, String productURL, String productDesc) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productReleaseDate = productReleaseDate;
        this.productAvatar = productAvatar;
        this.productURL = productURL;
        this.productDesc = productDesc;
    }

    public Product(String productName, Double productPrice, Date productReleaseDate, String productAvatar, String productURL, String productDesc) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productReleaseDate = productReleaseDate;
        this.productAvatar = productAvatar;
        this.productURL = productURL;
        this.productDesc = productDesc;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getProductReleaseDate() {
        return productReleaseDate;
    }

    public void setProductReleaseDate(Date productReleaseDate) {
        this.productReleaseDate = productReleaseDate;
    }

    public String getProductAvatar() {
        return productAvatar;
    }

    public void setProductAvatar(String productAvatar) {
        this.productAvatar = productAvatar;
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
