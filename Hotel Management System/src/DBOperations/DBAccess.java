 
package DBOperations;

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
    public boolean addCategory(String name,String loc){
        boolean status = false;  
        try {
            String add = "INSERT INTO `item_category` (name,location) VALUES ('"+name+"','"+loc+"')";
            ps = con.prepareStatement(add);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean updateCategory(int id,String name,String loc){
        boolean status = false;  
        try {
            String str = "Update  `item_category` set name='"+name+"',location='"+loc+"' WHERE catID="+id+" ";
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
    
    
    //Item details 
    public boolean addItem(String name,int catID,int supID,int qnty,int pr,int total,int restock){
        boolean status = false;  
        try {
            String add = "INSERT INTO `item`(`name`, `catID`, `supplierID`, `quantity`, `price`, `total`, `restockLevel`) VALUES ('"+name+"',"+catID+","+supID+","+qnty+","+pr+","+total+","+restock+") ";
            ps = con.prepareStatement(add);
            ps.execute();
            status = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return status;
    }

    public boolean updateItem(int id,String name,int catID,int supID,int qnty,int pr,int total,int restock){
        boolean status = false;  
        try {
            String str = " UPDATE `item` SET `name`='"+name+"',`catID`="+catID+",`supplierID`="+supID+",`quantity`="+qnty+",`price`="+pr+",`total`="+total+",`restockLevel`="+restock+" WHERE ID="+id+"  ";
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
    
    
    //Supplier details
    public String [] getOnlyManuFactName()
    {
        try {
            String str = "SELECT manufactName FROM supplier GROUP BY manufactName";
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
    
    public String [] getSupplierName(String manufacName)
    {
        try {
            String str = "SELECT name FROM supplier manufactName='"+manufacName+"' ";
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
