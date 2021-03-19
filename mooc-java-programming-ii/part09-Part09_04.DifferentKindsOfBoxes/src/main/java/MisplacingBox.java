public class MisplacingBox extends Box {
    @Override
    public void add(Item item) {
        getItems().add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
