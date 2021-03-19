import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public  Suitcase(int maximumWeight){
        this.maximumWeight=maximumWeight;
        this.items=new ArrayList<>();
    }

    public boolean isEmpty(){
        if (items.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    public int totalWeight(){
        if (items.isEmpty()){
            return 0;
        }else {
            int currentTotalWeight=0;
            for(Item item:items){
                currentTotalWeight+= item.getWeight();
            }
            return currentTotalWeight;

        }

    }

    public void addItem(Item item){
        if (totalWeight()+item.getWeight()<=maximumWeight){
            items.add(item);

        }

    }

    public void printItems(){
        for(Item items:items){
            System.out.println(items);
        }

    }

    public String toString(){
        if (items.size()==0){
            return "no items (0 kg)";
        }else if(items.size()==1){
            return "1 item ("+totalWeight()+" kg)";
        }else {
            return items.size()+" items ("+totalWeight()+" kg)";

        }

        }


    public int getMaximumWeight() {
        return maximumWeight;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        else{
            Item heaviestItem=items.get(0);
            for(Item items:items){
                if(items.getWeight()>heaviestItem.getWeight()){
                    heaviestItem=items;
                }
            }
            return heaviestItem;
        }
    }
}
