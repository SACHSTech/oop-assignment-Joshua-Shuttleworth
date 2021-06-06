package company;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff {
    private String firstName, lastName;
    public String clockIn;
    public Staff(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
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
    public String getClockout() {
        if(clockIn != null)
            return clockIn;
        return "You have not clocked in yet";
    }
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
}
