package company;

/**
 * @author Joshua Shuttleworth
 */
public class Intern extends Staff{

    /** 
     * Constructor for Intern class sets the first and last names of the intern
     * @param firstName first name of the intern your creating
     * @param lastName last name of the intern your creating
     */
    public Intern(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * Getter method to get the last clock in time of the intern
     * @return
     */
    public String managerClockCheck() {
        if(clockIn != null)
            return clockIn;
        return "The intern has not clocked in yet";
    }
}
