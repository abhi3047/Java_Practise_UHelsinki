import java.util.HashMap;

public class Abbreviations {

    private HashMap<String,String> abbrevations;

    public Abbreviations(){
        this.abbrevations=new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.abbrevations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(this.abbrevations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        if(hasAbbreviation(abbreviation)){
            return this.abbrevations.get(abbreviation);
        }else {
            return null;
        }
    }
}
