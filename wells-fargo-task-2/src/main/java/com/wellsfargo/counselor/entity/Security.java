package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity

public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String categpry;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security(){

    }

    public Security(String name, String category, int purchasePrice, Date purchaseDate, int quantity){
        this.categpry = category;
        this.name = name;
        this.purchaseDate =purchaseDate;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
    }

    public long getSecurityId(){
        return securityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public void setCategpry(String categpry) {
        this.categpry = categpry;
    }

    public String getCategpry() {
        return categpry;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
