public class PrimeFactor{
    public static void main(String[] args) {
        long center = 434567898;
        for(int i = 2; i < center; i++){
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    j = 0;
                    break;
                } else {
                    if(i % j != 0 && j == (i-1) && center % i == 0){
                        j = 0;
                        System.out.println(i);
                    }
                }
            }
        }
    }
}