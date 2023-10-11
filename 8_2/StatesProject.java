public class StatesProject {
    public static void main(String[] args) {
        StateList list = new StateList();
        list.addState(new State(1, 200));
        list.addState(new State(2, 300));
        list.addState(new State(3, 400));
        list.addState(new State(50, 5000000));
        System.out.println(list.findMax());
    }
}