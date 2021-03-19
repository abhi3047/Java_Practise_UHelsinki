
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String alphabetCollection="";
        if (elements.isEmpty()) {
            return "The collection "+ this.name+" is empty.";
        } else if (elements.size() == 1) {
            String text= "The collection "+ this.name+" has " + elements.size() + " element:\n";

            for (String item : elements) {
                alphabetCollection=alphabetCollection+item;
            }
            return text+alphabetCollection;
        } else {
            String text= "The collection "+ this.name+" has " + elements.size() + " elements:\n";
            for (String item : elements) {
                alphabetCollection=alphabetCollection+item +"\n";
            }
            return text+alphabetCollection;
            }
        }
    }

    



