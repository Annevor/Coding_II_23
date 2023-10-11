import java.util.ArrayList;
import java.util.Iterator;
import Functions.Conv;
public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for(int i = 0; i <= 50; i++){
            ints.add(i);
        }
        Iterator<Integer> iter = ints.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            System.out.println(num);
            if(!Conv.isPrime(num)){
                iter.remove();
            }
        }
        ints.add(0,2);
        System.out.println("Primes within list: " +ints);
    }
}
