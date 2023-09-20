public class PrisonTest {
    public static void main(String[] args) {
        Prisoner twitch = new Prisoner();
        twitch.height =  "1.73";
        twitch.name =  new String("Twitch");
        twitch.sentence = 3;
        Prisoner bubba = new Prisoner();
        bubba.height = "2.08";
        bubba.name = new String("bubba");
        bubba.sentence = 4;
        System.out.println(bubba.name == twitch.name);
        bubba.name = "bubba";
        twitch.name = "bubba";
        System.out.println(bubba.name == twitch.name);
    }
}
