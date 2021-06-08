package company;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author Joshua Shuttleworth
*/
public class Staff {
    // Private decloration of vars
    private String firstName, lastName;
    public String clockIn;

    /** Constructor for Staff class sets the first and last names of the staff
    * @param firstName first name of the staff your creating
    * @param lastName last name of the staff your creating
    */
    public Staff(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /** Formatts and saves the current time when this method is called */
    public boolean clockIn() {
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            this.clockIn = formatter.format(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /** Returns clockIn if its not null other wise it returns "You have not clocked in yet" */
    public String getClockout() {
        if(clockIn != null)
            return clockIn;
        return "You have not clocked in yet";
    }

    /** Returns firstName */
    public String getfirstName() {
        return firstName;
    }

    /** Returns lastName */
    public String getlastName() {
        return lastName;
    }
}
