import java.util.Scanner;
public class MathTest {
    public static void main(String[] args) {
        double one = Math.abs(-1.23);
        double two = Math.pow(3,2);
        double three = Math.sqrt(121.0) - Math.sqrt(256.0);
        double four = Math.abs(Math.min(-3,-5));
        //System.out.println(one);
        //System.out.println(two);
        //System.out.println(three);
        //System.out.println(four);
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(Math.min(Math.max(age, 0), 40));
        sc.close();
    }
}
