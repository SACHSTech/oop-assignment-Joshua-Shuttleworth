package company;

public class CEO extends Staff{
    private double salary;
    public CEO(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
