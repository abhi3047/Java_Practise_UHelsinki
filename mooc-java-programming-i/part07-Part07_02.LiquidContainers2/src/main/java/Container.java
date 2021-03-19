public class Container {
    private int currentAmount;

    public Container(){
        this.currentAmount=0;
    }

    public int contains(){
        return this.currentAmount;
    }

    public void add(int amount){
        if ((amount+this.currentAmount<=100) && amount>0){
            this.currentAmount=this.currentAmount+amount;
        }else{
            this.currentAmount=100;
        }

    }

    public void remove(int amount){
        if ((this.currentAmount-amount>=0) && amount>0){
            this.currentAmount=this.currentAmount-amount;
        }else{
            this.currentAmount=0;
        }

    }




    @Override
    public String toString(){
        return this.contains()+"/100";

    }
}
