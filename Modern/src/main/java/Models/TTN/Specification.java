package Models.TTN;

public class Specification {

    private Product product;
    private int amount;
    private double cost;

    public Specification(Product product, int amount,double cost){
        this.product = product;
        this.amount = amount;
        this.cost = cost;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
