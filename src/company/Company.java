package company;
import java.util.*;

public class Company {
    private String companyName;
    private CEO companyHead;
    private ArrayList<Manager> managers;
    private ArrayList<Intern> interns;
    public Company(String companyName, CEO companyHead) {
        this.companyName = companyName;
        this.companyHead = companyHead;
        managers = new ArrayList<Manager>();
        interns = new ArrayList<Intern>();
    }
    public void addManager(Manager manager) {
        managers.add(manager);
    }
    public void addIntern(Intern intern) {
        interns.add(intern);
    }
    public CEO getCEO() {
        return companyHead;
    }
    public Manager getManager(String firstName, String lastName) {
        for(int i=0;i<managers.size();i++) {
            if((managers.get(i).getfirstName()).equals(firstName) && (managers.get(i).getlastName()).equals(lastName))
                return managers.get(i);
        }
        return null;
    }
    public Intern getIntern(String firstName, String lastName) {
        for(int i=0;i<interns.size();i++)
            if((interns.get(i).getfirstName()).equals(firstName) && (interns.get(i).getlastName()).equals(lastName))
                return interns.get(i);
        return null;
    }
    public void fire(Manager manager) {
        managers.remove(manager);
    }
    public void fire(Intern intern) {
        interns.remove(intern);
    }
    public String getCompanyName() {
        return companyName;
    }
}
