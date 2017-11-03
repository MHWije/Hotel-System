 
package Classes;
 
public class Item {
    private int ID;
    private String name;
    private int catID;
    private int supID;
    private int quantity;
    private int price;
    private int total;
    private int reStockLvl;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public int getSupID() {
        return supID;
    }

    public void setSupID(int supID) {
        this.supID = supID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getReStockLvl() {
        return reStockLvl;
    }

    public void setReStockLvl(int reStockLvl) {
        this.reStockLvl = reStockLvl;
    }
    
    
}
