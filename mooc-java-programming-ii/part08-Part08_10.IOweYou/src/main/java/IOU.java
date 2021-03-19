import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> splitWise;

    public IOU(){
        this.splitWise=new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        splitWise.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){
       return splitWise.getOrDefault(toWhom,0.0);
    }
}
