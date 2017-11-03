 
package DBOperations;

import Classes.Item;
import Classes.ItemCategory;
import Classes.Supplier;
import Classes.User;
import Connection.Connection2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 
public class DBAccess {
     
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String [] arr;
    int ID=0;  
    String email=null;
    
    public DBAccess() {
        con=Connection2.getConnection();
    }
    
    
    //Category details 
    public boolean addCategory(ItemCategory ob){
        boolean status = false;  
        try {
            String add = "INSERT INTO `item_category` (name,location) VALUES ('"+ob.getName()+"','"+ob.getLocation()+"')";
            ps = con.prepareStatement(add);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean updateCategory(ItemCategory ob){
        boolean status = false;  
        try {
            String str = "Update  `item_category` set name='"+ob.getName()+"',location='"+ob.getLocation()+"' WHERE catID="+ob.getCatID()+" ";
            ps = con.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
    public boolean deleteCategory(int id){
        boolean status = false;  
        try {
            String str = "DELETE FROM `item_category` WHERE catID="+id+" ";
            ps = con.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
    public ResultSet dataSetCategory()
    {
        try {
            String str="SELECT catID as CategoryID,name as Name,location as Location  FROM `item_category`";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
    
    public String [] getOnlyCatName()
    {
        try {
            String str = "SELECT name FROM `item_category`";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery();
            List rowValues = new ArrayList();
            while (rs.next()) {
                rowValues.add(rs.getString(1));
            }
// You can then put this back into an array if necessary
            arr = (String[]) rowValues.toArray(new String[rowValues.size()]);
        } catch (Exception e) {
        }
        return arr;
    }
    
     public int getCatID(String name)
    {
        
        try {
            String str = "SELECT catID FROM item_category WHERE name='"+name+"'  ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                ID = rs.getInt("catID");
            } 
        } catch (Exception e) {
        }
        return ID;
    }
    
    
    //Item details 
    public boolean addItem(Item ob){
        boolean status = false;  
        try {
            String add = "INSERT INTO `item`(`name`, `catID`, `supplierID`, `quantity`,`remainQnty`,`price`, `total`, `restockLevel`,`status`) VALUES ('"+ob.getName()+"',"+ob.getCatID()+","+ob.getSupID()+","+ob.getQuantity()+","+ob.getRemainquant()+","+ob.getPrice()+","+ob.getTotal()+","+ob.getReStockLvl()+",'"+ob.getStatus()+"') ";
            ps = con.prepareStatement(add);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean updateItem(Item ob ){
        boolean status = false;  
        try {
            String str = " UPDATE `item` SET `name`='"+ob.getName()+"',`catID`="+ob.getCatID()+",`supplierID`="+ob.getSupID()+",`quantity`="+ob.getQuantity()+",`remainQnty`="+ob.getRemainquant()+",`price`="+ob.getPrice()+",`total`="+ob.getTotal()+",`restockLevel`="+ob.getReStockLvl()+",`status`='"+ob.getStatus()+"' WHERE ID="+ob.getID()+"  ";
            ps = con.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
    public boolean deleteItem(int id){
        boolean status = false;  
        try {
            String str = "DELETE FROM `item` WHERE ID="+id+" ";
            ps = con.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
    public ResultSet dataSetItem()
    {
        try {
            String str=" SELECT i.ID as ItemID,i.name as Name,c.name as CategoryType,s.name as SupplierName,i.quantity as Quantity,i.remainQnty as RemainQuantity,i.price as Price,i.total as Total,i.restockLevel AS RestockLevel,i.status AS Status FROM item i,item_category c,supplier s WHERE i.catID=c.catID and i.supplierID=s.ID  ";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet dataSetItemFromName(String name)
    {
        try {
            String str=" SELECT i.ID as ItemID,i.name as Name,c.name as CategoryType,s.name as SupplierName,i.quantity as Quantity,i.remainQnty as RemainQuantity,i.price as Price,i.total as Total,i.restockLevel AS RestockLevel,i.status AS Status FROM item i,item_category c,supplier s WHERE i.catID=c.catID and i.supplierID=s.ID and i.name LIKE '%"+name+"%'  ";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    } 
    
    public ResultSet dataSetItemFromNameWithDanger(String name)
    {
        try {
            String str=" SELECT i.ID as ItemID,i.name as Name,c.name as CategoryType,s.name as SupplierName,i.quantity as Quantity,i.remainQnty as RemainQuantity,i.price as Price,i.total as Total,i.restockLevel AS RestockLevel,i.status AS Status FROM item i,item_category c,supplier s WHERE i.catID=c.catID and i.supplierID=s.ID and i.name LIKE '%"+name+"%' and i.status='Danger' ";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    } 
    
    public ResultSet dataSetDangerItem()
    {
        try {
            String str=" SELECT i.ID as ItemID,i.name as Name,c.name as CategoryType,s.name as SupplierName,i.quantity as Quantity,i.remainQnty as RemainQuantity,i.price as Price,i.total as Total,i.restockLevel AS RestockLevel,i.status AS Status FROM item i,item_category c,supplier s WHERE i.catID=c.catID and i.supplierID=s.ID and i.status='Danger'  ";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    } 
 
    
    //Supplier Details
    
    public boolean addSupplier(Supplier ob){
        boolean status = false;  
        try {
            String add = "INSERT INTO `supplier`(`name`, `email`, `tele`) VALUES ('"+ob.getName()+"','"+ob.getEmail()+"','"+ob.getTele()+"')";
            ps = con.prepareStatement(add);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean updateSupplier(Supplier ob ){
        boolean status = false;  
        try {
            String str = "UPDATE `supplier` SET `name`='"+ob.getName()+"',`email`='"+ob.getEmail()+"',`tele`='"+ob.getTele()+"' WHERE ID="+ob.getID()+"  ";
            ps = con.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
    public boolean deleteSupplier(int id){
        boolean status = false;  
        try {
            String str = "DELETE FROM `supplier` WHERE ID="+id+" ";
            ps = con.prepareStatement(str);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }
    
    public ResultSet dataSetSupplier()
    {
        try {
            String str="SELECT `ID` as SupplierID, `name` as Name, `email` as Email, `tele` as TeleNumber FROM `supplier`  ";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
    
    public String [] getSupplierName()
    {
        try {
            String str = "SELECT name FROM supplier GROUP BY name ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery();
            List rowValues = new ArrayList();
            while (rs.next()) {
                rowValues.add(rs.getString(1));
            }
// You can then put this back into an array if necessary
            arr = (String[]) rowValues.toArray(new String[rowValues.size()]);
        } catch (Exception e) {
        }
        return arr;
    }
    
    public String getSupplierEmail(String name)
    {
        
        try {
            String str = "SELECT email FROM supplier WHERE name='"+name+"' ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                email = rs.getString("email");
            } 
        } catch (Exception e) {
        }
        return email;
    }
    
    public int getSupplierID(String name)
    {
        
        try {
            String str = "SELECT ID FROM supplier WHERE name='"+name+"' ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                ID = rs.getInt("ID");
            } 
        } catch (Exception e) {
        }
        return ID;
    }
    
    
    
    //User Details
    public ArrayList<User> getUser(String name)
    {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String str = "SELECT `name`,UserType ,`pwd` FROM `User` WHERE name='"+name+"' ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new User(rs.getString("name"),rs.getString("UserType"),rs.getString("pwd")));
            } 
        } catch (Exception e) {
        }
        return list;
    }
    
}//Class End
