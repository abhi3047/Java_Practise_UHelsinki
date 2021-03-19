
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        if (isPresent(word)){
            return this.translations.get(word);

        }
        return null;
    }

    public void add(String word, String translation) {

            this.translations.put(word, translation);

    }

    public boolean isPresent(String word){
        if (translations.containsKey(word)){
            return true;
        }
        return false;

    }

}
