import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class YardSale {
    public void yardSaleWholeSale(String itemName, int qty, double price){
        double totalPrice = price * qty;
        System.out.println("Name    Qty    Price    Total");
        System.out.println("----    ---    -----    -------");
        System.out.printf("%-6s %-7d $%-9.1f $%.2f%n%n", itemName, qty, price, totalPrice);
        System.out.println("\t Thank you. Come again!!!\n");
        System.out.printf("Purchased on: %s%n", LocalDate.of(2024, 4, 25).format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
    }
}
