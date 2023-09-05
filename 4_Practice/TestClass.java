public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        ComputeMethods things = new ComputeMethods();
        System.out.println("Converted temp is: "+things.FToC(212));
        System.out.println("Hypotenuse is: " +things.hypotenuse(6, 8));
        System.out.println(things.roll());
    }
}
