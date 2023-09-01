import java.util.Random;

public class ComputeMethods {
    public double FToC(double degreesF){
        double temp = ((degreesF - 32) * (5.0/9));
        return temp;
    }
    public double hypotenuse(int a, int b){
        double length = Math.sqrt((a * a) + (b * b));
        return length;
    }
    public int roll(){
        int d1 = (int)((Math.random() * 5) +1);
        int d2 = (int)((Math.random() * 5) +1);
        int sum = d1 + d2;
        System.out.println("d1: "+d1 + " d2: "+d2);
        return sum;
    }
}

