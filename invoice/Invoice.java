

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
            this.partNumber = partNumber;
            this.price = price;
            this.partDescription = partDescription;
            this.quantity = quantity;
            if (quantity > 0) {
                this.quantity = quantity;
            }
            if (price > 0) {
                this.price = price;         
            }
        }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double pricePerItem) {
        this.price = pricePerItem;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount(int quantity, double pricePerItem) {
        double invoiceAmount = 0;
        if (quantity >= 1) {
            invoiceAmount = quantity * pricePerItem;
        }
        if (quantity < 0)
            quantity = 0;
        if (pricePerItem < 0)
            pricePerItem = 0.0;
        return invoiceAmount;
    }
} 