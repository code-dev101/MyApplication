package com.example.randolph.myapplication;

/**
 * Created by Randolph on 2/1/2017.
 */

public class Sales {
    private String SalesDate;
    private String ProdID;
    private String Qty;
    private Double Amount;

    public String getSalesDate() {
        return SalesDate;
    }

    public void setSalesDate(String salesDate) {
        SalesDate = salesDate;
    }

    public String getProdID() {
        return ProdID;
    }

    public void setProdID(String prodID) {
        ProdID = prodID;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }
}
