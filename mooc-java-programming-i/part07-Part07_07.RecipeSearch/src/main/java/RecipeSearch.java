
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface=new UserInterface(scanner);
        RecipeList recipeList=new RecipeList();

        System.out.println("File to read: ");
        String fileName=scanner.nextLine();

//        recipeList.addRecipes(fileName);
        userInterface.recipeOperations(fileName);




//        userInterface.recipeOperations();
        System.out.println();
        System.out.println();
        ///
//        System.out.println("name:");
//        String name=scanner.nextLine();
//        RecipeList recipeList=new RecipeList();
//        recipeList.addRecipes(name);

    }

}
