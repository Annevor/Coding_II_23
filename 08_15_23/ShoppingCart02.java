public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a " +itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 378.79;
        double tax = 0.1;
        int quantity = 11;
        double totalPrice = price*(1 + tax);
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        message = custName+" wants to purchase " + quantity + " " +itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("This will cost " +custName + " $" +totalPrice);
    }    
}
