import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price){
//        System.out.println("test  "+items.values());

        for(Item item: items.values()){


            if(item.getProduct().equals(product)){

                item.increaseQuantity();
                return;
            }
        }
        items.put(product,new Item(product,1,price));

    }

    public int  price(){
        int totalPrice = 0;
        for(Item item : items.values()){
            totalPrice=totalPrice+item.price();

        }
        return totalPrice;
    }

    public void print(){
        for(Item item: items.values()){
            String text = item.getProduct()+": "+item.getQty();
            System.out.println(text);
        }
    }





}

