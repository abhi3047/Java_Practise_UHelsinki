import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String,Integer> productPrice;
    private Map<String,Integer> productStock;

    public Warehouse(){
        this.productPrice=new HashMap<>();
        this.productStock=new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product,price);
        this.productStock.put(product,stock);

    }

    public int price(String product){
        if(productPrice.containsKey(product)) {
            int price=productPrice.get(product);
            return price;

        }
        return -99;
    }

    public int stock(String product){
        if(productStock.containsKey(product)){
            return productStock.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        if(productStock.containsKey(product) && this.stock(product)>0){
            int newStock=this.stock(product)-1;
            productStock.put(product,newStock);
            return true;

            }
        return false;

    }

    public Set<String> products(){
        Set<String> items = productStock.keySet();
        return items;

    }



}