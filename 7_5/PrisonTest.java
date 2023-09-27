//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell Kroger = new Cell("Kroger", true, 6789);
        Cell Walmart = new Cell("Walmart", false, 1234);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, Kroger);
        bubba.display(true);
        Kroger.openDoor(6789);
        Kroger.openDoor(1243);
        Kroger.openDoor(6789);
    }
}
