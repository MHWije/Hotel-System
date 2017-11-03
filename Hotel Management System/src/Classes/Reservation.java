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
public class Reservation {
    //Reservation properties
    private int id,guestID,roomID,headCount;
    private String checkIN,checkOut;
    private double cost;

    public Reservation() {
    }

    public Reservation(int id, int guestID, int roomID, int headCount, String checkIN, String checkOut, double cost) {
        this.id = id;
        this.guestID = guestID;
        this.roomID = roomID;
        this.headCount = headCount;
        this.checkIN = checkIN;
        this.checkOut = checkOut;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }

    public String getCheckIN() {
        return checkIN;
    }

    public void setCheckIN(String checkIN) {
        this.checkIN = checkIN;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
}
