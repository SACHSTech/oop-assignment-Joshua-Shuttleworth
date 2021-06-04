package groceries;
public class Item {
    public static int stock = 0;
    private String productName;
    private int productID;
    private double price;
    private int[] experationDate = new int[3];
    public Item(String productName, int productID, double price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        stock++;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setExperationDate(int year, int month, int day) {
        this.experationDate[0] = year;
        this.experationDate[1] = month;
        this.experationDate[2] = day;
    }
    public String purchase() {
        if(inStock())
            return "Item purchased";
        return "Could not purchase because item is not in stock";
    }
    public boolean inStock() {
        if(stock > 0) return true;
        return false;
    }
    public String getExperation() {
        return experationDate[0] + "/" + experationDate[1] + "/" + experationDate[2];
    }
    public String toString() {
        return "The " + productName + " costs $" + price + " and is product #" + productID + ". It will expire on " + this.getExperation() + " There are " + stock + " total items in the store.";
    }
}