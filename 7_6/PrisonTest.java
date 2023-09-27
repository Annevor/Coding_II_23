//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);
        
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
        Prisoner jacob = new Prisoner("Jacob", 1.85, 5, cellB1);
        Prisoner tanner = new Prisoner("Tanner", 1.5, 56, cellC1);
        Prisoner adam = new Prisoner("Adam", 4.53, 1500, cellD1);

        bubba.display(true);
        jacob.display(true);
        tanner.display(true);
        adam.display(true); 
        System.out.println("There are " +Prisoner.getPrisonerCount() + " prisoners inside.  " +Math.PI);
    }
}
