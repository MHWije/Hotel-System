/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mhWiJe
 */
public class Room_CategoryModel {
    //Room Category properties
    private int id;
    private String name;
    private double pricePerHead;
    private boolean isActive;

    public Room_CategoryModel() {
    }

    public Room_CategoryModel(int id, String name, double pricePerHead, boolean isActive) {
        this.id = id;
        this.name = name;
        this.pricePerHead = pricePerHead;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerHead() {
        return pricePerHead;
    }

    public void setPricePerHead(double pricePerHead) {
        this.pricePerHead = pricePerHead;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
}
