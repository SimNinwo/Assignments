

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;


    public Employee(String firstName, String lastName,
        double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.monthlySalary = monthlySalary;
        }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getfirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getYearlySalary()  {
        double yearlySalary;
        yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }
    public double newYearlySalary() {
        double newSalary;
        newSalary = monthlySalary * 1.1;
        double yearly = newSalary * 12;
                return yearly;
    }
}