/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import Classes.GuestModel;
import Connection.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mhWiJe
 */
public class Guest {
    
    //connection
    Connection conn;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Guest() {
        conn = MySQLConnection.createConnection();
    }
    
    
    //Retrieve Guest details
    public ResultSet GuestRecords()
    {
        try {
            String str="SELECT * FROM `guest` WHERE isActive=1";
            ps=conn.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return rs;
    }
    
    //Add a new guest
    public boolean addGuest(GuestModel GM){
        boolean status = false;  
        try {
            String insert = "INSERT INTO `guest`(Name,NIC,TP,Email,Address,isActive) VALUES('"+GM.getName()+"','"+GM.getNIC()+"','"+GM.getTP()+"',"
                    + "'"+GM.getEmail()+"','"+GM.getAddress()+"','"+1+"')";
            ps = conn.prepareStatement(insert);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Upadte a guest
    public boolean updateGuest(GuestModel GM){
        boolean status = false;  
        try {
            String str = "Update `guest` set Name='"+GM.getName()+"',NIC='"+GM.getNIC()+"',TP='"+GM.getTP()+"', "
                    + "Email='"+GM.getEmail()+"',Address='"+GM.getAddress()+"' WHERE idGuest="+GM.getId()+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
    
    //Delete a guest
    public boolean DeleteGuest(int id){
        boolean status = false;  
        try {
            String str = "Update `guest` set isActive='"+0+"' WHERE idGuest="+id+" ";
            ps = conn.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return status;
    }
}
