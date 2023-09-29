public class Prizes {
    private String name;
    private int cost;
    private int stock;
    private String description;

    //Constructor
    public Prizes(String name, String description, int cost, int stock){
        this.stock = stock;
        this.name = name;
        this.cost = cost;
        this.description =description;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }


    //Setters

    public void setStock(int newStock) {
        stock = newStock;
    }
}
