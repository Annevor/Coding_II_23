package Functions;

public class Conv{
    public static boolean isPrime(int candidate){
        boolean poss = false;
        for(int i = 2; i < candidate; i++){
            if(candidate % i != 0){
                poss = true;
            } else {
                poss = false;
				break;
            }
        }
        return poss;
    }
}