import java.math.*;
public class P10{
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
        int j = 2;
        BigInteger endValue = BigInteger.valueOf(2000000L);

        for(BigInteger i = BigInteger.TWO; i.compareTo(endValue) != 0; i = i.add(BigInteger.ONE)) {
            if(Functions.Conv.isPrime(j) == true){
                sum.add(i);
            }
            j++;
        }
        System.out.println(sum);
    }
}