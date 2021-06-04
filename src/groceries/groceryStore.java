package groceries;
import java.io.*;
import java.util.ArrayList;
public class groceryStore {
    private ArrayList<Item> Inventory = new ArrayList<Item>();
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String menuSelection = "null";
        while(true) {
            System.out.println("Welcome to the grocery store inventory manager");
            System.out.println("----------------------------------------------");
            System.out.println("1. Produce");
            System.out.println("2. Deli");
            System.out.println("3. Bakery");
            System.out.println("4. Meat and Seafood");
            System.out.print("> ");
            while(true) {
                switch(br.readLine()) {
                    case "1": 
                        produce();
                    break;
                    case "2":
                        deli();
                    break;
                    default: System.out.println("Please select a valid number");
                }
            }
        }
        /*
        Item tomato = new Item("Tomato", 297, 2.45);
        tomato.setExperationDate(2021, 6, 15);
        System.out.println(tomato);
        tomato.setPrice(2.00);
        System.out.println(tomato);

        Produce carrot = new Produce("Carrot", 346, 1.95);
        carrot.setStockDate(2021, 6, 2);
        if(carrot.setLastWater())
            System.out.println(carrot.getLastWater());
        System.out.println(carrot);
        */
    }
    private static void produce() throws IOException {
        System.out.println("Welcome to the produce section");
        System.out.println("------------------------------");
        menuOptions();

    }
    private static void deli() throws IOException {
        System.out.println("Welcome to the deli section");
        System.out.println("---------------------------");
        menuOptions();
    }
    private static void menuOptions() {
        System.out.println("Enter the product name followed by: ");
        System.out.println("back. go back to previous page");
        System.out.println("1. Add new");
        System.out.println("2. Remove item");
        System.out.print("> ");
        // https://stackoverflow.com/questions/10531513/how-to-identify-object-types-in-java
    }
}
