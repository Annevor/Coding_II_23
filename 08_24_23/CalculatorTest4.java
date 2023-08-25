public class CalculatorTest4 {
    public static void main(String[] args) {
        
       Calculator4 calc = new Calculator4();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       double[] prices = {10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0};
       double total = 0;
       for(int i = 0; i < 8; i++){
        total += calc.findTotal(prices[i], "Person " +(++i));
        i --;
       }
        System.out.println("The whole table owes $" + total);
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
