
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    //addmeal
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);

        }

    }

    //printmenu
    public void printMeals() {
        for (String item : meals) {
            System.out.println(item);
        }
    }

    //clearlist
    public void clearMenu() {
////        for(String item:meals){
//       while(true){
//           meals.remove(meals.get(meals.size()-1));
//           if(meals.size()==0){
//               break;
//           }
//        }
        while(meals.size()>0){
            meals.remove(meals.size()-1);
        }

    }
}
