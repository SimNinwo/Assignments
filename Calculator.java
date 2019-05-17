/** Calculator program
    Author: Simeon O.
    Created: 17'05'2019 8.20AM */

    import java.util.Scanner; // created class scanner

public class Calculator { // create class calculator
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in); // create first scanner to collect input from user

        System.out.print("Enter first value: "); // prompt
        
        int number1 = ins.nextInt(); // collects first value from user input

        System.out.print("Enter second value: "); // prompt
        int number2 = ins.nextInt(); // collects second value from user input

        Scanner opt = new Scanner(System.in); // create second scanner to collect operator from user

        System.out.print("Enter operator: ");
        String operator = opt.next();
        

        if(operator.equals("+")) {
            System.out.print("Answer is: " +(number1 + number2));
        }
        else if(operator.equals("-")) {
            System.out.print("Answer is: "+(number1 - number2));
        }
        else if(operator.equals("*")) {
            System.out.print("Answer is: "+(number1 * number2));
        }
        else if(operator.equals("%")) {
            System.out.print("Answer is: "+(number1 % number2));
        }

        System.out.println();
    }
}