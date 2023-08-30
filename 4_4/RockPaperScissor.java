import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random rng = new Random();
        int randomNum = rng.nextInt(3);
        if(randomNum == 0){
            System.out.println("rock");
        }
        if(randomNum == 1){
            System.out.println("paper");
        }
        if(randomNum == 2){
            System.out.println("scissors");
        }
    }
}
