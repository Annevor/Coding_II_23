public class Chickens01 {
    public static void main(String[] args) {
        int chickenCount = 3;
        int eggsPerChicken = 5;
        for(int i = 0; i < 2; i++){
            int totalEggs = 0;
            // Monday
            totalEggs = chickenCount * eggsPerChicken;
            // Tuesday
            totalEggs += ++chickenCount* eggsPerChicken;
            // Wednesday
            totalEggs += (chickenCount / 2) * eggsPerChicken;
            chickenCount = 8;
            eggsPerChicken = 4;
            System.out.println(totalEggs);
        }
    }   
}
