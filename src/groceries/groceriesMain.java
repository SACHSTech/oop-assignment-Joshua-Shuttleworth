package groceries;
import java.io.*;

public class groceriesMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        groceries Items = new groceries(223);
        groceriesMain gr = new groceriesMain();
        gr.drawMenu();
        while(true) {
            switch(br.readLine()) {
                case "1": gr.produceMenu(br, Items); break;
                case "2": gr.produceMenu(br, Items); break;
                default: System.out.println("Please enter a valid menu option."); break; 
            }
        }   
    }
    private void drawMenu() {
        clearScreen();
        System.out.println("Welcome to the grocery store inventory manager");
        System.out.println("----------------------------------------------");
        System.out.println("1. Produce");
        System.out.println("2. Deli");
        System.out.println("3. Bakery");
        System.out.println("4. Meat and Seafood");
        System.out.print("> ");
    }
    private void produceMenu(BufferedReader br, groceries Items) throws IOException {
        boolean running = true;
        clearScreen();
        System.out.println("Welcome to the produce menu");
        System.out.println("---------------------------");
        System.out.println("1. Add a item");
        System.out.println("2. Remove a item");
        System.out.println("3. Water");
        System.out.println("4. Get data");
        System.out.println("5. back");
        System.out.print("> ");
        while(running) {
            switch(br.readLine()) {
                case "1":
                    System.out.print("Enter product name: ");
                    String productName = br.readLine();
                    System.out.print("Enter product id: ");
                    int productID = Integer.parseInt(br.readLine());
                    System.out.print("Enter product price: ");
                    double price = Double.parseDouble(br.readLine());
                    Produce pr = new Produce(productName, productID, price);
                    Items.addProduce(pr);
                    System.out.print("Enter stock date: ");
                    pr.setExperationDate(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
                break;
                case "2":
                    Items.subProduce();
                break;
                case "3":
                    
                break;
                case "4":

                break;
            }
        }
    }
    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
// https://stackoverflow.com/questions/10531513/how-to-identify-object-types-in-java