public class FibonacciRevamp{
    public static void main(String[] args){
        int lead = 1;
        int trail = 1;
        int endSum = 0;
        while(lead < 4000000){
            if(lead % 2 == 0){
                endSum += lead;
            }
            lead = lead + trail;
            trail = lead - trail;
        }
        System.out.println(endSum);
    }
}