 
package DBOperations;

import Classes.Item;
import Classes.ItemCategory;
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
            String str="SELECT * FROM `item_category`";
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
            String str = "SELECT ID FROM supplier name='"+name+"' ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                ID = rs.getInt("ID");
            } 
        } catch (Exception e) {
        }
        return ID;
    }
    
    
    //Item details 
    public boolean addItem(Item ob){
        boolean status = false;  
        try {
            String add = "INSERT INTO `item`(`name`, `catID`, `supplierID`, `quantity`, `price`, `total`, `restockLevel`) VALUES ('"+ob.getName()+"',"+ob.getCatID()+","+ob.getSupID()+","+ob.getQuantity()+","+ob.getPrice()+","+ob.getTotal()+","+ob.getReStockLvl()+") ";
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
            String str = " UPDATE `item` SET `name`='"+ob.getName()+"',`catID`="+ob.getCatID()+",`supplierID`="+ob.getSupID()+",`quantity`="+ob.getQuantity()+",`price`="+ob.getPrice()+",`total`="+ob.getTotal()+",`restockLevel`="+ob.getReStockLvl()+" WHERE ID="+ob.getID()+"  ";
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
            String str="SELECT * FROM `item`";
            ps=con.prepareStatement(str);
            rs=ps.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
    
    
//    //Supplier details
//    public String [] getOnlyManuFactName()
//    {
//        try {
//            String str = "SELECT manufactName FROM supplier GROUP BY manufactName";
//            ps = con.prepareStatement(str);
//            rs = ps.executeQuery();
//            List rowValues = new ArrayList();
//            while (rs.next()) {
//                rowValues.add(rs.getString(1));
//            }
//// You can then put this back into an array if necessary
//            arr = (String[]) rowValues.toArray(new String[rowValues.size()]);
//        } catch (Exception e) {
//        }
//        return arr;
//    }
    
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
    
    public int getSupplierID(String name)
    {
        
        try {
            String str = "SELECT ID FROM supplier name='"+name+"' ";
            ps = con.prepareStatement(str);
            rs = ps.executeQuery(); 
            while (rs.next()) {
                ID = rs.getInt("ID");
            } 
        } catch (Exception e) {
        }
        return ID;
    }
    
}//Class End
