import java.time.Year;
import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date(12, 04, 1090);
        Scanner input = new Scanner(System.in);


        int day;
        int month;
        int year;

        System.out.print("Enter day: ");
        day = input.nextInt();

        System.out.print("Enter month: ");
        month = input.nextInt();

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.println(date1.displayDate(day, month, year));
        input.close();
    }
}