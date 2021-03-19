
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int tacos){
        this.tacos=tacos;
    }

    public int getTacos(){
        return this.tacos;
    }

    @Override
    public int tacosRemaining() {
        return getTacos();
    }

    @Override
    public void eat() {
        if (tacosRemaining()>0){
            this.tacos-=1;
        }

    }
}
