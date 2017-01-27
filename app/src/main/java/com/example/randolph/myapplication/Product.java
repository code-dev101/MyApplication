package com.example.randolph.myapplication;

import java.io.Serializable;

/**
 * Created by user on 1/27/2017.
 */

public class Product implements Serializable{
    private String ProductID;
    private int Quantity;
    private double Price;
    private double Total;
    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }


}
