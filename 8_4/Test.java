public class Test {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        while (n > 0){
            sum = sum + n;
            n--;
            /* System.out.println(n);
            System.out.println(sum); */
        }//end while
        System.out.println("The sum of the integers 1 to 10 is " + sum);
    }
}
