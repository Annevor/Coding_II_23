public class BoundaryTesting {

    public static void main(String args[]) {
        int CALENDAR_START = 1583;
        int year = 1584;
        int month = 13;
        // validate input 
        if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
            System.out.println("Bad request: " + year + " " + month);
        }

    }

}
