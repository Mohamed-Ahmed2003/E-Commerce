import java.time.LocalDate;

public class App{
    public static void main(String[] args){
        Store warehouse=new Store();
        Product p1= new Product("cheese",100,5,LocalDate.of(2026, 02, 25),500);
        Product p2= new Product("Biscuits",150,7,LocalDate.of(2026, 5, 10),100);
        warehouse.add(p1);
        warehouse.add(p2);
        Cart c= new Cart(warehouse);
        c.add("cheese",3);
        c.add("Biscuits", 2);
        c.checkOut();
    }
}