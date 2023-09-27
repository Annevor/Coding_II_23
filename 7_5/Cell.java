public class Cell {

    
// Fields
    private String name;
    private boolean open;
    private int code;
    
    
// Constructor
    public Cell(String name, boolean open, int code){
        this.name = name;
        this.open = open;
        this.code = code;
    }

    
// Methods
    public String getName(){
        return name;
    }

    public boolean getOpen(){
        return open;
    }

    public void openDoor(int givenCode){
        if(givenCode != code){
            System.out.println("Wong code.");
        }
        if(open == true && givenCode == code){
            open = false;
            System.out.println("Door has closed.");
        } else if(open == false && givenCode == code){
            open = true;
            System.out.println("Door has opened.");
        }
    }
}