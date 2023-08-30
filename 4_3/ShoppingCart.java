
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Bartholomeu Baumgartener";
        String firstName;
        String lastName;
        int spaceIdx;
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        lastName = custName.substring(spaceIdx, custName.length());
        System.out.println(firstName + " asldkfjlkjfflkjgg " +lastName);

        
        // Get the index of the space character (" ") in custName. 


        // Use the substring method parse out the first name and print it.


    }

    
}
