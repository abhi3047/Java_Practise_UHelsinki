import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftsPackage;

    public Package(){
        this.giftsPackage=new ArrayList<>();
    }

    public void addGift(Gift gift){
        giftsPackage.add(gift);
    }
    public int totalWeight(){
        int totalWeight=0;
        for(Gift item:giftsPackage){
            totalWeight=totalWeight+ item.getWeight();
        }
        return totalWeight;
    }
}
