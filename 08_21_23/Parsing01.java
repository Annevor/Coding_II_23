public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7ndaf840cbda14";
        
        //Parse shirtPrice and taxRate, and print the total tax
        double tax = Integer.parseInt(shirtPrice) * Double.parseDouble(taxRate);
        System.out.println(tax);
        
        
        //Try to parse taxRate as an int
            //taxRate = Integer.parseInt(taxRate);   error thing that can be removed
        //Try to parse gibberish as an int
            //gibberish = Integer.parseInt(gibberish);  another error that can be removed
    }
    
}
