package company;
import java.util.*;

/**
 * @author Joshua Shuttleworth
 */
public class Company {
    private String companyName;
    private CEO companyHead;
    private ArrayList<Manager> managers;
    private ArrayList<Intern> interns;

    /**
     * Constructor for Company sets the companyName and the companyHead
     * Initalizes the arraylists
     * @param companyName
     * @param companyHead
     */
    public Company(String companyName, CEO companyHead) {
        this.companyName = companyName;
        this.companyHead = companyHead;
        managers = new ArrayList<Manager>();
        interns = new ArrayList<Intern>();
    }

    /**
     * Adds given manager to the arrayList
     * @param manager
     */
    public void addManager(Manager manager) {
        managers.add(manager);
    }

    /**
     * Adds given intern to the arrayList
     * @param intern
     */
    public void addIntern(Intern intern) {
        interns.add(intern);
    }

    /**
     * Getter method to get companyHead
     * @return
     */
    public CEO getCEO() {
        return companyHead;
    }

    /**
     * Given the first and last names return the Manager that has a matching first and last name
     * @param firstName
     * @param lastName
     * @return
     */
    public Manager getManager(String firstName, String lastName) {
        for(int i=0;i<managers.size();i++) {
            if((managers.get(i).getfirstName()).equals(firstName) && (managers.get(i).getlastName()).equals(lastName))
                return managers.get(i);
        }
        return null;
    }

    /**
     * Given the first and last names return the Intern that has a matching first and lasy name
     * @param firstName
     * @param lastName
     * @return
     */
    public Intern getIntern(String firstName, String lastName) {
        for(int i=0;i<interns.size();i++)
            if((interns.get(i).getfirstName()).equals(firstName) && (interns.get(i).getlastName()).equals(lastName))
                return interns.get(i);
        return null;
    }

    /**
     * Remove given manager from the array list
     * @param manager
     */
    public void fire(Manager manager) {
        managers.remove(manager);
    }

    /**
     * Remove given intern from the array list
     * @param intern
     */
    public void fire(Intern intern) {
        interns.remove(intern);
    }

    /**
     * Getter method to get companyName
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }
}
