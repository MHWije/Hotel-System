/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;


import Classes.ReservationModel;
import Connection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mhWiJe
 */
public class Reservation {
    
    //connection
    Connection conn;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Reservation() {
        conn = MySQLConnection.createConnection();
    }
    
    
    //Retrieve reservation details
    public ResultSet ReservationRecords()
    {
        try {
            String str="SELECT * FROM `reservation`";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    //Add a new reservation
    public boolean addReservation(ReservationModel RM){
        boolean status = false;  
        try {
            String insert = "INSERT INTO `reservation`(GuestID,RoomID,checkinDate,checkoutDate,headCount,cost) VALUES('"+RM.getGuestID()+"','"+RM.getRoomID()+"','"+RM.getCheckIN()+"',"
                    + "'"+RM.getCheckOut()+"','"+RM.getHeadCount()+"','"+RM.getCost()+"')";
            ps = conn.prepareStatement(insert);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Upadte a guest
    public boolean updateReservation(ReservationModel RM){
        boolean status = false;  
        try {
            String str = "Update `reservation` set checkoutDate='"+RM.getCheckOut()+"',cost='"+RM.getCost()+"' WHERE idReservation="+RM.getId()+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Delete a guest
    public boolean DeleteReservation(int id){
        boolean status = false;  
        try {
            String str = "DELETE FROM `reservation` WHERE idReservation="+id+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
}
