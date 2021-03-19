
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word=in.nextLine();
        if (word.equals("true")){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }

    }
}
