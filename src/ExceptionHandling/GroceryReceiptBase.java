package ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroceryReceiptBase {
    private Map<String, Double> prices;
    private Map<String, Double> discounts;
    private List<String> purchases;

    public GroceryReceiptBase(Map<String, Double> prices, Map<String, Double> discounts, List<String> purchases) {
        this.prices = prices;
        this.discounts = discounts;
        this.purchases = purchases;
    }

    public List<String> generateInvoice() {
        List<String> invoice = new ArrayList<>();
        for (String item : purchases) {
            String[] itemInfo = item.split(","); // Split by commas
            String name = itemInfo[0].trim();
            int quantity = Integer.parseInt(itemInfo[2].trim().split(":")[1].trim()); // Extract quantity
            double price = prices.getOrDefault(name, 0.0);
            double discount = discounts.getOrDefault(name, 0.0);
            double total = quantity * price - discount;
            String invoiceItem = name + ", Price: " + price + ", Total Price: " + total;
            invoice.add(invoiceItem);
        }
        Collections.sort(invoice);
        return invoice;
    }
}

class GroceryReceipt extends GroceryReceiptBase {
    public GroceryReceipt(Map<String, Double> prices, Map<String, Double> discounts, List<String> purchases) {
        super(prices, discounts, purchases);
    }
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("item1", 10.0);
        prices.put("item2", 15.0);
        prices.put("item3", 20.0);
        Map<String, Double> discounts = new HashMap<>();
        discounts.put("item1", 2.0);
        discounts.put("item3", 5.0);
        List<String> purchases = new ArrayList<>();
        purchases.add("item1, Price: 10, Quantity: 3");
        purchases.add("item2, Price: 15, Quantity: 2");
        purchases.add("item3, Price: 20, Quantity: 4");
        GroceryReceipt receipt = new GroceryReceipt(prices, discounts, purchases);
        List<String> invoice = receipt.generateInvoice();
        for (String item : invoice) {
            System.out.println(item);
        }
    }
}
