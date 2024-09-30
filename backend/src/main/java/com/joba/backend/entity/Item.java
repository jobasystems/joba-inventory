package com.joba.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String itemName;
    private String category;
    private double price;
    private int quantity;

    public void setItemId(Long itemId){
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }
}