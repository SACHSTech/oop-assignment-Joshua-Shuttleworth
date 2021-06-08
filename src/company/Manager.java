package company;

/**
* @author Joshua Shuttleworth
*/
public class Manager extends Staff {
    private double salary;

    /** Constructor for Manager class sets the first and last names of the manager
    * @param firstName first name of the manager your creating
    * @param lastName last name of the manager your creating
    * @param salary salary of the manager your creating
    */
    public Manager(String firstName, String lastName, double salary){
        super(firstName, lastName);
        this.salary = salary;
    }

    /** Setter method to set salary value */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** Getter method to get salary value */
    public double getSalary() {
        return salary;
    }
}
