package Model;

public class Toy {
    private Type type;
    private  String  name;
    private  String quantity;
    private  int price;


    public Toy(Type type, String name, String quantity, int price) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
