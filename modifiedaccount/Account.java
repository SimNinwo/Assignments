
public class Account {

    private String name;
    private double balance;

    //Account constructo that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default intial value of 0.0
        if (balance > 0.0)
            this. balance = balance;
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
    }

    // method returns the amount balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setname(String name) {
        this.name = name;
    }

    // method that eturns the name
    public String getName() {
        return name; // give value of name back to caller
    } // end method getName
} // end class Accounnt
