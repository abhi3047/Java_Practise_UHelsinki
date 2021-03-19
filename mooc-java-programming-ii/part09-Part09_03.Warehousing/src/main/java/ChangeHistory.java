import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> amountHistory;

    public ChangeHistory(){
        this.amountHistory=new ArrayList<>();
    }

    public void add(double status){
        this.amountHistory.add(status);
    }

    public void clear(){
        this.amountHistory=new ArrayList<>();
    }
    public String toString(){
        String name=""+this.amountHistory;
        return name;
    }

    public double maxValue(){
        if (amountHistory.isEmpty()){
            return 0.0;
        }
        Double largeValue=amountHistory.get(0);
        for(Double value:amountHistory){
            if(value>largeValue){
                largeValue=value;
            }
        }
        return largeValue;
    }


    public double minValue(){
        if(amountHistory.isEmpty()){
            return 0.0;
        }
        Double smallValue=amountHistory.get(0);
        for(Double value:amountHistory){
            if(value<smallValue){
                smallValue=value;
            }

        }
        return smallValue;
    }

    public double average(){
        Double sum=0.0;
        for(Double value:amountHistory){
            sum+=value;
        }
        Double avg=sum/(amountHistory.size());
        return avg;
    }

    public ArrayList<Double> getAmountHistory(){
        return amountHistory;
    }
    public void saySomething(){
        System.out.println("working.....");
    }
}
