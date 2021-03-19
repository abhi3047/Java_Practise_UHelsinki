import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {

    private ArrayList<Recipe> recipes=new ArrayList<>();
    private Recipe recipe;


    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addRecipes(String fileName)  {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
//                System.out.println(name);
                int duration = Integer.valueOf(scanner.nextLine());
//                System.out.println(duration);
                String content = scanner.nextLine();
                ArrayList<String> words = new ArrayList<>();


                    while (!(content.isEmpty())) {
                            words.add(content);
                            if(!(scanner.hasNextLine())){
                                break;
                            }
                            content = scanner.nextLine();
//                            System.out.println(content + "..");
                   }
//                    System.out.println(words);
                    recipes.add(new Recipe(name,duration,words));
                }




        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void listAllRecipes() {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            System.out.println(recipe);

        }
    }


    public void printRecipeDetails(ArrayList<Recipe> recipeArrayList){
            if (recipeArrayList.isEmpty()){
                System.out.println("Recipes:");

        }else{
                System.out.println("Recipes:");
                for (Recipe recipe:recipeArrayList){
                    System.out.println(recipe);
                }
            }
        System.out.println();
    }

    public ArrayList<Recipe> searchRecipeByName(String name) {
        ArrayList<Recipe> recipeArrayListName=new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeName().contains(name)) {
                recipeArrayListName.add(recipe);
            }
        }
        return recipeArrayListName;
    }

    public ArrayList<Recipe> searchByCookingTime(int maxTime){
        ArrayList<Recipe> recipeArrayListDuration=new ArrayList<>();
        for(Recipe recipe:recipes){
            if(recipe.getDuration()<=maxTime){
                recipeArrayListDuration.add(recipe);

            }
        }
        return recipeArrayListDuration;

    }

    public ArrayList<Recipe> searchByIngredient(String ingredient){
        ArrayList<Recipe> recipeArrayListIngredients=new ArrayList<>();
        for(Recipe recipe:recipes){
            if(recipe.getIngredients().contains(ingredient)){
                recipeArrayListIngredients.add(recipe);

            }
        }
        return recipeArrayListIngredients;

    }





    }

