package collection;

import java.util.*;

public class InventoryManager {

    // TODO: 1. Declare a collection to store unique product IDs (Strings)
    private Collection<String> uniqueProducts;

    // TODO: 2. Declare a collection to act as the checkout queue (Strings representing customer names)
    private Queue <String> checkoutQueue;

    // TODO: 3. Declare a collection to map customer names (String) to their total order value (Double)
    private Map<String, Double> customerCarts;

    public InventoryManager() {
        // TODO: Initialize your collections here with the appropriate concrete classes
        uniqueProducts = new LinkedHashSet<>(); 
        checkoutQueue = new LinkedList<>();
        customerCarts = new HashMap<>();
    }

    // Add a product to the warehouse
    public void addProduct(String productId) {
        // TODO: Add product to uniqueProducts
        uniqueProducts.add(productId);
    }

    // Add a customer to the checkout line
    public void joinCheckoutQueue(String customerName) {
        // TODO: Add customer to the back of the queue
        checkoutQueue.add(customerName);
    }

    // Process the next customer in line
    public void processNextCheckout() {
        // TODO: Remove and print the customer at the FRONT of the queue.
        // If the queue is empty, print "No customers in line."
        if(!checkoutQueue.isEmpty()){
            String processedCustomer = checkoutQueue.poll();

            checkoutQueue.remove(processedCustomer);
            System.out.println("Successfully processed: " + processedCustomer);
        }else{
            System.out.println("No customers in line.");
        }
    }

    // Save or update a customer's cart total
    public void updateCartTotal(String customerName, double total) {
        // TODO: Map the customer name to their cart total
        customerCarts.put(customerName, total);
    }

    // Display the current state of the system (Do not modify this method)
    public void displayStatus() {
        System.out.println("--- Current System Status ---");
        System.out.println("Warehouse Unique Products: " + uniqueProducts);
        System.out.println("Customers in Queue: " + checkoutQueue);
        System.out.println("Active Customer Carts: " + customerCarts);
        System.out.println("-----------------------------\n");
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // 1. Test Unique Products (Duplicates should be ignored)
        manager.addProduct("PROD100");
        manager.addProduct("PROD200");
        manager.addProduct("PROD100"); // Duplicate!

        // 2. Test Checkout Queue (Should preserve order: Alice -> Bob)
        manager.joinCheckoutQueue("Alice");
        manager.joinCheckoutQueue("Bob");

        // 3. Test Customer Carts
        manager.updateCartTotal("Alice", 150.75);
        manager.updateCartTotal("Bob", 45.00);

        // Initial check
        manager.displayStatus();

        // 4. Test processing the queue
        System.out.println("Processing first customer...");
        manager.processNextCheckout(); // Should process Alice
        
        System.out.println("\nProcessing second customer...");
        manager.processNextCheckout(); // Should process Bob

        System.out.println();
        manager.displayStatus();
    }
}