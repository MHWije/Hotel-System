/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import Classes.RoomModel;
import Connection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mhWiJe
 */
public class Room {
    //connection
    Connection conn;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Room() {
        conn = MySQLConnection.createConnection();
    }
    
    
    //retrieve room table records
    public ResultSet RoomRecords()
    {
        try {
            String str="SELECT * FROM `room` WHERE isActive=1";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    //retrieve room table records
    public ResultSet AvailableRoomRecords()
    {
        try {
            String str="SELECT * FROM `room` WHERE isActive=1 AND isAvailable=1";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    
    //Add Room details 
    public boolean addRoom(RoomModel R){
        boolean status = false;  
        try {
            String insert = "INSERT INTO `room`(roomName,roomCategory,price,numberOfBeds,isAvailable,isActive) "
                    + "VALUES('"+R.getName()+"','"+R.getCategory()+"','"+R.getPrice()+"','"+R.getNoOfBeds()+"','"+1+"','"+1+"')";
            ps = conn.prepareStatement(insert);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    
    //Update Room details
    public boolean updateRoom(RoomModel R){
        boolean status = false;  
        try {
            String str = "Update `room` set roomName='"+R.getName()+"',roomCategory='"+R.getCategory()+"',price='"+R.getPrice()+"', "
                    + "numberOfBeds='"+R.getNoOfBeds()+"' WHERE idRoom="+R.getId()+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Delete Room details
    public boolean deleteRoom(int id){
        boolean status = false;  
        try {
            String str = "Update `room` set isActive='"+0+"' WHERE idRoom="+id+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    
    //Retrieve Name for given id
    public String RoomName(int id)
    {
        String name=null;
        try {
            String str="SELECT roomName FROM `room` WHERE idRoom='"+id+"'";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
            
            while(rs.next()){
                name = rs.getString("roomName");
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        return name;
    }
    
    //get room price
    public Double RoomPrice(int id)
    {
        Double name=null;
        try {
            String str="SELECT price FROM `room` WHERE idRoom='"+id+"'";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
            
            while(rs.next()){
                name = rs.getDouble("price");
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        return name;
    }
    
    //set availability of room when reserving
    public boolean RoomAvailability(int id)
    {
        boolean status=false;
        try {
            String str="Update `room` set isAvailable=0 WHERE idRoom='"+id+"'";
            ps=conn.prepareStatement(str);
            ps.execute();
            status=true;
        } catch (Exception e) {
            System.err.println(e);
        }
        return status;
    }
    
}//end of class