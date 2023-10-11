package Functions;

public class Conv{
    public static boolean isPrime(int candidate){
        boolean possible = false;
        for(int i = 2; i < candidate; i++){
            if(candidate == 2){
                possible = true;
                break;
            }
            if(candidate % i != 0){
                possible = true;
            } else {
                possible = false;
				break;
            }
        }
        return possible;
    }
}