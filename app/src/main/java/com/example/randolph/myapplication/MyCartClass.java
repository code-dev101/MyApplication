package com.example.randolph.myapplication;

/**
 * Created by Conan on 26/01/2017.
 */

public class MyCartClass {
    private int itemQty;
    private String itemName;
    private double itemPrice;
    private double itemTotalPrice;

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void setItemTotalPrice(double itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }
}
