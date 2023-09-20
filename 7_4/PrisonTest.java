//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class PrisonTest {
    public static void main(String[] args){
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);
        Prisoner p02 = new Prisoner();
        p01.printFields();
        p02.printFields(false);
    }
}
