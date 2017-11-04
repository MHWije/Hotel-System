/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

/**
 *
 * @author Sachini
 */

/*import packages*/
import Connection.MySQLConnection_hr;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class hr_DBAccess {
    /*init connection variables*/
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
        
    /**
     * define constructor to initiate connection 
     */
     public hr_DBAccess() {
        con=MySQLConnection_hr.createConnection();
    }
     
     /**
      * define login user method
     * @param username
     * @param password
     * @return 
      */
     public boolean login(String username,String password){
         boolean status=false;
         try {
            String user = "SELECT * FROM `user_account` WHERE `username`=?";
            ps = con.prepareStatement(user);
            ps.setString(1,username);
            rs=ps.executeQuery();
                       
            while(rs.next()){
               if(rs.getString("password").equals(password)){
                    status = true;
               }else{
                   JOptionPane.showMessageDialog(null,  "Invalid password!","Alert", JOptionPane.ERROR_MESSAGE);
               }               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Invalid User!", "Alert", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
         return status;
     }
     /**
      * method to register a new Employee
      * @param newUser
      * @return 
      */
     public boolean register(ArrayList <String> newUser){
         boolean status=false;
         try {
            String addUser = "INSERT INTO `user`(`fname`, `lname`, `email`, `phone`, `address`, `gender`, `dob`, `department`, `supervisor`, `designation`)"+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(addUser);
            ps.setString(1,newUser.get(0));
            ps.setString(2,newUser.get(1));
            ps.setString(3,newUser.get(4));
            ps.setString(4,newUser.get(5));
            ps.setString(5,newUser.get(2));
            ps.setString(6,newUser.get(6));
            ps.setString(7,newUser.get(3));
            ps.setString(8,newUser.get(8));
            ps.setString(9,newUser.get(7));
            ps.setString(10,newUser.get(9));
            int num=ps.executeUpdate();
            if(num>0){
                status = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
         return status;
     }
     
     /**
      * method to get user department id
     * @param deptname
     * @return 
      */
     public int getDeptId(String deptname){
        int deptID=0;
        try {
            String dept = "SELECT `dept_id` FROM `department` WHERE `dept_name`=?";
            ps = con.prepareStatement(dept);
            ps.setString(1,deptname);
            rs=ps.executeQuery();
                       
            while(rs.next()){
               deptID=rs.getInt("dept_id");
               }       
         
        }catch(SQLException e){
         
        }
        return deptID;
    } 
     
     /**
      * method to get supervisor id
     * @param supName
     * @return 
      */
     public int getsupID(String supName){
     int supID=0;
       try {
            String sup = "SELECT `user_id`FROM `user` WHERE `fname`=?";
            ps = con.prepareStatement(sup);
            ps.setString(1,supName);
            rs=ps.executeQuery();
                       
            while(rs.next()){
               supID=rs.getInt("user_id");
               }       
         
        }catch(SQLException e){
         
        }
         
     return supID;
     }
     
     /**
      * method to add user account details
     * @param userAccount
     * @return 
      */
     public boolean addUserAccount(ArrayList <String> userAccount){
     boolean status=false;
     try {
            String sup = "INSERT INTO `user_account`(`username`, `password`) VALUES(?,?)";
            ps = con.prepareStatement(sup);
            ps.setString(1,userAccount.get(0));
            ps.setString(2,userAccount.get(1));
            int num=ps.executeUpdate();
                       
            if(num>0){
                status = true;
            }        
         
        }catch(SQLException e){
         System.out.println(e);
        }
        
     return status;
     }
     
     /**
      * method to get all user details
     * @return 
      */
     public ResultSet getAllUsers()
    {
        try {
            String str="SELECT * FROM `user`";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
     
     /**
      * method to update an employee
     * @param userList
     * @return 
      */
     public boolean updateUser(List<List> userList){
        boolean status = false;  
        try {
            String str = "UPDATE `user` SET `fname`=?,`lname`=?,`email`=?,`phone`=?,`address`=?,`gender`=?,`dob`=?,`department`=?,`supervisor`=?,`designation`=? WHERE `user_id`='"+userList.get(8);
            ps = con.prepareStatement(str);
            ps.setString(1,userList.get(0).toString());
            ps.setString(2,userList.get(1).toString());
            ps.setString(3,userList.get(2).toString());
            ps.setString(4,userList.get(3).toString());
            ps.setString(5,userList.get(4).toString());
            ps.setString(6,userList.get(5).toString());
            ps.setString(7,userList.get(6).toString());
            ps.setString(8,userList.get(7).toString());
            ps.setString(9,userList.get(9).toString());
            ps.setString(10,userList.get(10).toString());
            
            int num=ps.executeUpdate();
            if(num>0){
            status=true;
            }
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
     
     /**
      * method to delete an employee
     * @param id
     * @return 
      */
     public boolean deleteUser(List<List> userList){
        boolean status = false;  
        try {
            String str = "DELETE FROM `user` WHERE `user_id`='"+userList.get(8);
            ps = con.prepareStatement(str);
            int num=ps.executeUpdate();
            if(num>0){
                status=true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
     
}
