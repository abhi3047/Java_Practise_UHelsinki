
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username=in.nextLine();
        System.out.println("Enter password: ");
        String password=in.nextLine();
        if (username.equals("alex")){
            if (password.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            }
        }else if (username.equals("emma")){
            if (password.equals("haskell")){
                System.out.println("You have successfully logged in!");
            }
        }else{
            System.out.println("Incorrect username or password!");
        }



    }
}
