import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner sc = new Scanner( System.in );
        System.out.print( "Provide 5 test scores: " );
        int[] scores = new int[5];
        double avg = 0;
        int sum = 0;
        for( int i = 0; i < scores.length; i++ ){
            scores[i] = sc.nextInt();
        }
        for( int score : scores ){
            sum += score;
        }
        avg = sum / scores.length;
        System.out.println( "Average test score: " +avg );
        sc.close();
    }
}