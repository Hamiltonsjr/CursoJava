package application.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + " R$ "
                + String.format("%.2f",price)
                + " QTS: " + quantity + " Total: "
                + String.format("R$ %.2f", totalValueInStock());
    }
}
