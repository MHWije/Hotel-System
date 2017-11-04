/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import Classes.Room_ServiceModel;
import Connection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mhWiJe
 */
public class Room_Service {
    //connection
    Connection conn;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Room_Service() {
        conn = MySQLConnection.createConnection();
    }
    
    
    //retrieve room_service table records
    public ResultSet Room_ServiceRecords()
    {
        try {
            String str="SELECT * FROM `room_service`";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    
    //Add Room_Category details 
    public boolean addRoomService(Room_ServiceModel RSM){
        boolean status = false;  
        try {
            String insert = "INSERT INTO `room_service`(roomID,menuID,status,date) VALUES('"+RSM.getRoomID()+"','"+RSM.getMenuID()+"','pending','"+RSM.getDate()+"')";
            ps = conn.prepareStatement(insert);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    
    //Update Room_serrvice details
    public boolean updateRoomService(Room_ServiceModel RSM){
        boolean status = false;  
        try {
            String str = "Update `room_service` set menuID='"+RSM.getMenuID()+"',date='"+RSM.getDate()+"' WHERE idroom_service="+RSM.getId()+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Delete Room_service details
    public boolean deleteRoomService(int id){
        boolean status = false;  
        try {
            String str = "DELETE FROM `room_service` WHERE idroom_service="+id+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Retrieve menus
    public ResultSet MenuList()
    {
        try {
            String str="SELECT * FROM `menu`";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    public String MenuDes(int id){
        String name=null;
        try {
            String str="SELECT menu_des FROM `menu` WHERE menu_id='"+id+"'";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
            
            while(rs.next()){
                name = rs.getString("menu_des");
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        return name;
    }
}
