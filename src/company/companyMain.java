package company;

import java.io.*;

/**
 * Demo project to demonstrate the company class
 * @author Joshua Shuttleworth
 */
public class companyMain {

    /**
     * Demo project entry point
     * @param args
     */
    public static void main(String[] args) {
        // I know Jeff Bezos makes more then that but whatever
        CEO jeff = new CEO("Jeff", "Bezos", 250000.00);
        Manager jim = new Manager("Jim", "Browning", 85000.00);
        Manager kyle = new Manager("Kyle", "Smith", 78000.00);
        Intern bill = new Intern("Bill", "Johnson");
        
        Company company = new Company("Amazon", jeff);
        company.addManager(jim);
        company.addManager(kyle);
        company.addIntern(bill);

        // Main loop
        while(true) {
            try {
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                run(company);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * This is the body of program demonstrates basic functionality of the company class
     * @param company
     * @throws IOException
     */
    public static void run(Company company) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What kind position are you: ");
        switch(br.readLine()){
            case "CEO":
                CEO ceo = company.getCEO();
                if(ceo == null)
                    break;
                System.out.println(ceo.getClockout());
                System.out.print("Would you like to clock in(y/n): "); 
                if(br.readLine().equals("y"))
                    if(ceo.clockIn())
                        System.out.println(ceo.getClockout());
                System.out.print("Would you like to check your yearly salary(y/n): ");
                if(br.readLine().equals("y"))
                    System.out.println("$" + ceo.getSalary());
                System.out.println("Would you like to do any of the following actions");
                System.out.println("-------------------------------------------------");
                System.out.println("1. Change salary");
                System.out.println("2. Fire");
                System.out.println("3. Exit");
                System.out.print("> ");
                String menuOption= br.readLine();
                if(menuOption.equals("1") || menuOption.equals("2")) {
                    System.out.print("Enter the position of the employee: ");
                    switch(br.readLine()) {
                        case "Manager":
                            System.out.print("Enter the name of the manager (first name followed by last): ");
                            Manager mngerToChange = company.getManager(br.readLine(), br.readLine());
                            if(menuOption.equals("2")) {
                                company.fire(mngerToChange);
                                break;
                            }
                            System.out.println(mngerToChange.getfirstName() + "'s current salary is " + mngerToChange.getSalary());
                            System.out.print("Enter the new salary: ");
                            mngerToChange.setSalary(Double.parseDouble(br.readLine()));
                            System.out.println(mngerToChange.getfirstName() + "'s new salary is " + mngerToChange.getSalary());
                        break;
                        case "Intern":
                            if(menuOption.equals("1")) {
                                System.out.println("Interns do not have a salary to change.");
                                break;
                            }
                            System.out.print("Enter the name of the intern (first name followed by last): ");
                            if(menuOption.equals("2")) {
                                company.fire(company.getIntern(br.readLine(), br.readLine()));
                                break;
                            }
                        break;
                    }
                }
            break;
            case "Manager":
                System.out.print("Please enter your first name followed by last name: ");
                Manager mnger = company.getManager(br.readLine(), br.readLine());
                if(mnger == null)
                    System.out.println("BADDD");
                System.out.println(mnger.getClockout());
                System.out.print("Would you like to clock in(y/n): "); 
                if(br.readLine().equals("y"))
                    if(mnger.clockIn())
                        System.out.println(mnger.getClockout());
                System.out.print("Would you like to check your yearly salary(y/n): ");
                if(br.readLine().equals("y"))
                    System.out.println(mnger.getSalary());
                System.out.print("Would you like to check a intern's last clock in?(y/n): ");
                if(br.readLine().equals("y")){
                    System.out.print("Enter the name of the intern (first name followed by last): ");
                    Intern intern = company.getIntern(br.readLine(), br.readLine());
                    System.out.println(intern.managerClockCheck());
                }
            break;

            case "Intern":
                System.out.print("Please enter your first name followed by last name: ");
                Intern itrn = company.getIntern(br.readLine(), br.readLine());
                if(itrn == null)
                    System.out.println("BADDD");
                System.out.println(itrn.getClockout());
                System.out.print("Would you like to clock in(y/n): "); 
                if(br.readLine().equals("y"))
                    if(itrn.clockIn())
                        System.out.println(itrn.getClockout());
            break;
        }
        System.out.println("Thanks for being apart of " + company.getCompanyName());
        br.readLine();
    }
}