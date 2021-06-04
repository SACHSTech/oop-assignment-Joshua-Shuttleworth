package groceries;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Produce extends Item{
    private String lastWater = "never";
    private int[] stockDate = new int[3];
    public Produce(String productName, int productID, double price) {
        super(productName, productID, price);
    }
    public boolean setLastWater() {
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.lastWater = formatter.format(date);
            return true;
        } catch (Exception e) {
            return false;
        }     
    }
    public String getLastWater() {
        return lastWater;
    }
    public void setStockDate(int year, int month, int day) {
        this.stockDate[0] = year;
        this.stockDate[1] = month;
        this.stockDate[2] = day;
    }
    public String getExperation() {
        String dt = this.stockDate[0] + "/" + this.stockDate[1] + "/" + this.stockDate[2];
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dt));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.add(Calendar.DATE, 14);
        dt = sdf.format(c.getTime());
        return dt;
    }
}