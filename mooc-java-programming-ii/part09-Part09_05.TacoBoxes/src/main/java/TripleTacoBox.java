public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox(){
        this.tacos=3;
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
            this.tacos=this.tacos-1;
        }

    }
}
