public class OneItemBox extends Box {

    public OneItemBox(){

    }
    @Override
    public void add(Item item) {
        if(getItems().isEmpty()){
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
