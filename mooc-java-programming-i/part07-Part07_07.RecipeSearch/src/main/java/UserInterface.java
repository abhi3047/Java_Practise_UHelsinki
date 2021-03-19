import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeList=new RecipeList();
    }

    public void recipeOperations(String fileName){

        recipeList.addRecipes(fileName);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true){
            System.out.println("Enter command: ");
            String command=scanner.nextLine();
            if (command.equals("list")){
                recipeList.listAllRecipes();
            }else if(command.equals("stop")){
                break;
            }else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String recipeName=scanner.nextLine();
                ArrayList<Recipe> listByNames= recipeList.searchRecipeByName(recipeName);
                recipeList.printRecipeDetails(listByNames);
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int cookingTime=Integer.valueOf(scanner.nextLine());
                ArrayList<Recipe> listByTime= recipeList.searchByCookingTime(cookingTime);
                recipeList.printRecipeDetails(listByTime);
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient=scanner.nextLine();
                ArrayList<Recipe> listByIngredients=recipeList.searchByIngredient(ingredient);
                recipeList.printRecipeDetails(listByIngredients);


            }

        }
    }
}
