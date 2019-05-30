

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John ", "Lawerence ", 20_000.00);
        Employee employee2 = new Employee("Adam ", "Great ", 34_000.00);

        System.out.printf("%s %s salary is: $%.2f%nSalary per annum: $%.2f%n", employee1.getfirstName(), employee1.getLastName(), employee1.getMonthlySalary(), employee1.getYearlySalary());
        System.out.printf("%s %s salary is: $%.2f%nSalary per annum: $%.2f%n", employee2.getfirstName(), employee2.getLastName(), employee2.getMonthlySalary(), employee2.getYearlySalary());
 

        System.out.println("After a 10% raise Salary per annum:");
        System.out.print(employee1.getfirstName() + employee1.getLastName());
        System.out.println(employee1.newYearlySalary());
        System.out.println(employee2.getfirstName() +  employee2.getLastName() + employee2.newYearlySalary());
    }
}