import java.time.LocalDate;
import java.util.HashMap;

public class Cart {
    private HashMap<Product,Integer> receipt= new HashMap<>();
    private Store warehouse;
    private double subtotal=0;
    private double shipping=0;
    private double totalWeight=0;
    private double amount=0;
    public Cart (Store w){
        this.warehouse=w;
    }

    //add in the receipt
    public void add(String name , Integer quantity ){
        Boolean valid=false ;
        for (Product product : warehouse.getWarehouse()) {
            if(name==product.getName()&&quantity <= product.getQuantity()&&product.getExpireDate()!=LocalDate.now()){
                receipt.put(product, quantity);
                totalWeight+=product.getWeight();
                shipping=totalWeight *0.01;
                subtotal+=product.getPrice()*receipt.get(product);
                amount=subtotal+shipping;
                valid=true;
                break;
            }
        }
        if(!valid)
            System.out.print("the item is out of stock");
    }
    //console print 
    public void checkOut(){
        System.out.println("** Shipping notice **");
        for(Product product : receipt.keySet()){
            System.out.println(receipt.get(product)+"x "+product.getName()+"  "+product.getWeight());
            
        }
        System.out.println("total weight is :" +totalWeight);
        System.out.println("**checkout receipt**");
        for(Product product : receipt.keySet()){
            System.out.println(receipt.get(product)+"x "+product.getName()+"  "+product.getPrice()*receipt.get(product));
        }
        System.out.println("===================");
        System.out.println("subtotal    "+ subtotal);
        System.out.println("shipping    "+shipping);
        System.out.println("amount  "+amount);
    }
}
