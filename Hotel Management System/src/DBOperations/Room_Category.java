/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import Classes.Room_CategoryModel;
import Connection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mhWiJe
 */
public class Room_Category {
    
    //connection
    Connection conn;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Room_Category() {
        conn = MySQLConnection.createConnection();
    }
    
    
    //retrieve room_category table records
    public ResultSet Room_CategoryRecords()
    {
        try {
            String str="SELECT * FROM `room_category` WHERE isActive=1";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    
    //Add Room_Category details 
    public boolean addRoomCategory(Room_CategoryModel RC){
        boolean status = false;  
        try {
            String insert = "INSERT INTO `room_category`(name,pricePerHead,isActive) VALUES('"+RC.getName()+"','"+RC.getPricePerHead()+"','"+1+"')";
            ps = conn.prepareStatement(insert);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    
    //Update Room_Category details
    public boolean updateRoomCategory(Room_CategoryModel RC){
        boolean status = false;  
        try {
            String str = "Update `room_category` set name='"+RC.getName()+"',pricePerHead='"+RC.getPricePerHead()+"' WHERE idRoom_Category="+RC.getId()+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Delete Room_Category details
    public boolean deleteRoomCategory(int id){
        boolean status = false;  
        try {
            String str = "Update `room_category` set isActive='"+0+"' WHERE idRoom_Category="+id+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
}//end of class
