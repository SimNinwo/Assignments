/** file: Account.java
 *  Name: Simeon O.
 *  Created: 23'05'2019 
 */

 public class Account {
    private String name; // intance variable
    private double balance;

    // constructor initializes name with parameter name
    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }


    // method to set the name of object
    public void setName(String name) {
        this.name = name; // store name of object
    }

    // method to get the name of object
    public String getName() {
        return name; // return value of name of object
    }

    // method for withdrawal
    public double withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        }
        if (withdrawAmount > balance) {
            System.out.print("Withdrawal amount exceeded account balance");
        }
        return balance;
        
    }
} // end class Account