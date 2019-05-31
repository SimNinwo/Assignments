
import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

       
        
        Scanner input = new Scanner(System.in);

        System.out. print("Enter first name: ");
        String firstName1 = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName1 = input.nextLine();

        System.out.print("Enter date of birth\n day:");
        int day = input.nextInt();
        System.out.print("month: ");
        int month = input.nextInt();
        System.out.print("year: ");
        int year = input.nextInt();
        String dateOfBirth = day + "/" + month + "/" + year;
        HeartRates heart1 = new HeartRates(firstName1, lastName1, dateOfBirth);

        System.out.print("Name: " + heart1.getFirstName());
        System.out.println( heart1.getLastName());
        System.out.println("Date of Birth: " + heart1.getDateOfBirth(day, month, year));
        System.out.println("Age: " + heart1.age(year));
        System.out.println("Maximum Heart rate: " + heart1.maxHeartRate(year));
        System.out.printf("Target-heart-rate: %.2f", heart1.targetRate(year));

    }
}