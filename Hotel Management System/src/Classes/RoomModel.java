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
public class RoomModel {
    //Room properties
    private int id,category,NoOfBeds;
    private String name;
    private double price;
    private boolean isActive,isAvailable;

    public RoomModel() {
    }

    public RoomModel(int id, int category, int NoOfBeds, String name, double price, boolean isActive, boolean isAvailable) {
        this.id = id;
        this.category = category;
        this.NoOfBeds = NoOfBeds;
        this.name = name;
        this.price = price;
        this.isActive = isActive;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getNoOfBeds() {
        return NoOfBeds;
    }

    public void setNoOfBeds(int NoOfBeds) {
        this.NoOfBeds = NoOfBeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
}
