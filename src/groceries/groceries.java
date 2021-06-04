package groceries;
import java.util.*;

public class groceries {
    private int storeID;
    private ArrayList<Produce> produce;
    private ArrayList<Deli> deli;
    public groceries(int storeID) {
        this.storeID = storeID;

        produce = new ArrayList<Produce>();
        deli = new ArrayList<Deli>();
    }
    public void addProduce(Produce newProduce) {
        produce.add(newProduce);
    }
    public void addDeli(Deli newDeli) {
        deli.add(newDeli);
    }
    public void subProduce() {
        produce.remove(produce.size());
    }
    public int getStoreID() {
        return storeID;
    }
}
