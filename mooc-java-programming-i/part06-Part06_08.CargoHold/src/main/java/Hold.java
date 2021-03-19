import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcasesHold;

    public Hold(int maxWeight){
        this.suitcasesHold=new ArrayList<>();
        this.maxWeight=maxWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }

    public int totalWeight(){
        if (suitcasesHold.isEmpty()){
            return 0;
        }else {
            int currentTotalWeight=0;
            for(Suitcase suitcase:suitcasesHold){
                currentTotalWeight+= suitcase.totalWeight();
            }
            return currentTotalWeight;

        }

    }

    public void addSuitcase(Suitcase suitcase){
        if (totalWeight()+suitcase.getMaximumWeight()<=maxWeight){
            suitcasesHold.add(suitcase);

        }

    }

   public String toString(){
        return suitcasesHold.size()+"  suitcases ("+totalWeight()+" kg)";
    }

    public void printItems(){
        for(Suitcase items:suitcasesHold){
           items.printItems();
        }
    }



}
