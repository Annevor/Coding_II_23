import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Scheduler{
    Random randInt = new Random();
    private int temp;
    private int counter = 0;
    Games game = new Games();
    public Scheduler(){
        Scanner sc = new Scanner(System.in);
        while(counter < 3){
            for(int i = 0;; i++){
                try{
                    System.out.print("Temp for week " +(i + 1) +": ");
                    temp = sc.nextInt();
                    if(temp <= 32){
                        Games.setTemperatures(temp);
                        counter++;
                    } else {
                        Games.setTemperatures(temp);
                        counter = 0;
                    }
                    if(counter == 3){
                        System.out.println("Season is over.");
                        break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Invalid Input.");
                    i--;
                    sc.next();
                }
            }
            break;
        }
        sc.close();
        System.out.println("\n\n");
            for(int i = 0; i < Games.tempSize(); i++){
                int rand1 = randInt.nextInt(Teams.teamList.size());
                int rand2 = randInt.nextInt(Teams.teamList.size());
                while(rand1 == rand2){
                    rand2 = randInt.nextInt(Teams.teamList.size());
                }
                System.out.println("Temperature: "+Games.getTemperatures(i));
                game.playGame(Teams.teamList.get(rand1), Teams.teamList.get(rand2), Games.getTemperatures(i));
            }
        System.out.println("\n ******* STATS ******* \n");
        for(int i = 0; i < Teams.teamList.size(); i++){
            Teams.displayStats(Teams.teamList.get(i));
        }
        System.out.println("Hottest temp: "+Games.hottestTemp());
        System.out.println("Average temp: "+Games.avgTemp());
    }
}
