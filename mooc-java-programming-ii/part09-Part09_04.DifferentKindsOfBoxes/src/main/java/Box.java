
import java.util.ArrayList;

public abstract class Box {

    private int currentCapacity;
    private ArrayList<Item> items;

    public Box(){
        this.items=new ArrayList<>();
    }

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }


    public int getCurrentCapacity(){
        int sum=0;
        for(Item item:items){
            sum+=item.getWeight();

        }
        currentCapacity=sum;
        return currentCapacity;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public abstract boolean isInBox(Item item);
}
