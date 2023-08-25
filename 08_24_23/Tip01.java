public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double p1 = 10 * 1.05 * 1.15;
        double p2 = 12 * 1.05 * 1.15;
        double p3 = 9 * 1.05 * 1.15;
        double p4 = 8 * 1.05 * 1.15;
        double p5 = 7 * 1.05 * 1.15;
        double p6 = 15 * 1.05 * 1.15;
        double p7 = 11 * 1.05 * 1.15;
        double p8 = 30 * 1.05 * 1.15;
        System.out.println("$" +p1);
        System.out.println("$" +p2);
        System.out.println("$" +p3);
        System.out.println("$" +p4);
        System.out.println("$" +p5);
        System.out.println("$" +p6);
        System.out.println("$" +p7);
        System.out.println("$" +p8);
    } 
}
