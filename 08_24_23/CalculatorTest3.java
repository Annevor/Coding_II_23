public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
        calc.findTotal(10.0, "Person 1");
        calc.findTotal(12.0, "Person 2");
        calc.findTotal(9.0, "Person 3");
        calc.findTotal(8.0, "Person 4");
        calc.findTotal(7.0, "Person 5");
        calc.findTotal(15.0, "Person 6");
        calc.findTotal(11.0, "Person 7");
        calc.findTotal(30.0, "Person 8");
       
       
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
