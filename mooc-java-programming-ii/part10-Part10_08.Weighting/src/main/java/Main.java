

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Suitcase suitcase=new Suitcase(100);
        suitcase.getItems().stream().forEach(item -> item.getName());
    }

}
