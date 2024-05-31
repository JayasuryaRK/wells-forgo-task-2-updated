package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioid;

    @Column(nullable = false)
    private long clientid;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio(){

    }
    public Portfolio(long clientid, Date creationDate){
        this.clientid = clientid;
        this.creationDate = creationDate;
    }

    public long getPortfolioid() {
        return portfolioid;
    }

    public void setPortfolioid(long portfolioid) {
        this.portfolioid = portfolioid;
    }

    public long getClientid(){
        return clientid;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public void setClientid(long clientid){
        this.clientid = clientid;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

