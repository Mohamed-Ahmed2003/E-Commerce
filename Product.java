import java.time.LocalDate;

public class Product {
    private String name ;
    private double price ;
    private int quantity;
    private LocalDate expireDate ;
    private double weight;

    //constructor to items which do not have expireDate or shipping 
    public Product(String n , double p, int q ){
        this.name=n;
        this.price=p;
        this.quantity=q;
    }
    //constructor to items which have expiredate but don't have shipping
    public Product(String n , double p, int q, LocalDate e ){
        this.name=n;
        this.price=p;
        this.quantity=q;
        this.expireDate=e;
    }
    //constructor to items which have both expiredate and shiping
    public Product(String n , double p, int q, LocalDate e ,double w){
        this.name=n;
        this.price=p;
        this.quantity=q;
        this.expireDate=e;
        this.weight=w;
    }
    // contructor to items which have shipping but don't have expiredate 
    public Product(String n , double p, int q, double w ){
        this.name=n;
        this.price=p;
        this.quantity=q;
        this.weight=w;
    }

     // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter and Setter for expireDate
    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    // Getter and Setter for weight
    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }
}
