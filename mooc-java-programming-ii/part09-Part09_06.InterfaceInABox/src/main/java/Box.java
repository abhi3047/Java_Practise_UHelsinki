import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> items;

    private double maxWeight;

    public Box(double maxWeight){
        this.items=new ArrayList<>();
        this.maxWeight=maxWeight;
    }

    public void add(Packable packable) {
        if (canFit(packable)) {
            this.items.add(packable);
        }
    }

    public int noOfItems(){
        return items.size();
    }
    private double getMaxWeight(){
        return this.maxWeight;
    }

    public double getCurrentWeight(){
        double currentWeight=0;
        for (Packable packable:items){
            currentWeight=currentWeight+packable.weight();
        }
        return currentWeight;
    }

    @Override
    public double weight(){
        return getCurrentWeight();

    }

    public boolean canFit(Packable packable){
        boolean result=true;
        if (getCurrentWeight() + packable.weight()>getMaxWeight()){
            result=false;
        }
        return result;
    }

    @Override
    public String toString(){
        String text="Box: "+this.noOfItems()+" items, total weight "+this.getCurrentWeight()+" kg";
        return text;
    }



}
