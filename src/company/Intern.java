package company;

public class Intern extends Staff{
    
    public Intern(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public String managerClockCheck() {
        if(clockIn != null)
            return clockIn;
        return "The intern has not clocked in yet";
    }
}
