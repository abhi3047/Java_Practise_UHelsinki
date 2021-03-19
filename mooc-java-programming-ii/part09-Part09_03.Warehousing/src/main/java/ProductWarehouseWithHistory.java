public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.changeHistory=new ChangeHistory();
        this.setBalance(initialBalance);

        this.changeHistory.add(initialBalance);
    }

    public String history(){
        String name="[";
        for(int i=0;i<changeHistory.getAmountHistory().size();i++){
            name+=changeHistory.getAmountHistory().get(i);
            if(i<changeHistory.getAmountHistory().size()-1){
                name+=", ";
            }


        }
        name+="]";
        return name;

    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount){
        double value= super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());
        return value;

    }

    public void printAnalysis(){
        System.out.print("Product: ");
        System.out.println(this.getName());
        System.out.print("History: ");
        System.out.println(this.history());
        System.out.print("Largest amount of product: ");
        System.out.println(this.changeHistory.maxValue());
        System.out.print("Smallest amount of product: ");
        System.out.println(this.changeHistory.minValue());
        System.out.print("Average: ");
        System.out.println(this.changeHistory.average());
    }
}
