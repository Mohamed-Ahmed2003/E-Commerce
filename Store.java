import java.util.ArrayList;

import java.util.List;

public class Store {
    static private List<Product> warehouse= new ArrayList<Product>();

    public void add(Product p){
        warehouse.add(p);
    }

    public List<Product> getWarehouse(){
        return warehouse;
    }
}
