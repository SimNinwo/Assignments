import java.util.Scanner;
public class InvoiceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter part number: ");
        String partNumber1 = input.nextLine();

        System.out.print("Enter description: ");
        String partDescription1 = input.nextLine();
        
        
        System.out.print("Enter quantity: ");
        int quantity1 = input.nextInt();
        Invoice invoice1 = new Invoice(partNumber1, partDescription1, quantity1, 5.00);
        System.out.printf("Part\tDescription\tQuantity\tPrice\tInvoiceAmmount%n%s\t%s\t%d\t\t$%.2f\t$%.2f ", 
            invoice1.getPartNumber(),invoice1.getPartDescription(), invoice1.getQuantity(), 
            invoice1.getPrice(), invoice1.getInvoiceAmount(quantity1, 5.00));
        input.close();

    }
}