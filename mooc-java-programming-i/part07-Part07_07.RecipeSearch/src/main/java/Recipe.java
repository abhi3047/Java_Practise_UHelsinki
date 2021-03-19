import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int duration;
    private ArrayList<String> ingredients;

    public Recipe(String name,int duration,ArrayList<String> ingredients){
        this.recipeName=name;
        this.duration=duration;
        this.ingredients=ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String toString(){
        String name = this.getRecipeName() + ", cooking time: " + this.getDuration();
        return name;
    }
}
