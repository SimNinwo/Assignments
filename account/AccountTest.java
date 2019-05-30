/* File: AccountTest.java
 * Account test that creates and uses a object of class Account
 * Author: Simeon O.
 * Created: 23'05'2019
 * Time: 8:25pm
 */

 import java.util.Scanner;

 // create the class AccountTest
 public class AccountTest {

    public static void main(String[] args) {

        // create an account object and assign it to myAccount
        Account account1 = new Account("Sam Oladimeji", 1000.00);
      

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount to withdraw for account1: ");
        double withdrawAmount = input.nextDouble();
        
        
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.withdraw(withdrawAmount));
        
        input.close();     
    }
 } // end class AccountTest