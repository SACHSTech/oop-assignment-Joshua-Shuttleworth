package company;

public class Manager extends Staff {
    private double salary;
    public Manager(String firstName, String lastName, double salary){
        super(firstName, lastName);
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
