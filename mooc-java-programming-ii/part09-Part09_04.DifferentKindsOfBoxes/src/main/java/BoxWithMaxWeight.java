public class BoxWithMaxWeight extends Box {

    private int capacity;

    public BoxWithMaxWeight(int capacity){
        this.capacity=capacity;
    }

    @Override
    public void add(Item item) {
        if(item.getWeight()+getCurrentCapacity()<=capacity){

            getItems().add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        if(getItems().contains(item)){
            return true;
        }else {
            return false;
        }
    }
}
