public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 5;
        double tax = 1.04;
        int stock = 10;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;
        // Test quantity and modify message if quantity > 1.  
         if (quantity > 1){
            message += "s";
            stock = stock - quantity;
            if(stock == 0){
                System.out.println(itemDesc +" is now out of stock");
            }
         }
         if(quantity > stock){
            message = "Our most sincerest apologies, for the item you have requested is not in our inventory.";
         } else {
            System.out.println(message + "\n" + "The total price is: $" +total);
         }
        
        // Test outOfStock and notify user in either case.  
    }
    
}


