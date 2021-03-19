
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first=in.nextLine();
        System.out.println("Enter the second string:");
        String second=in.nextLine();
        if(first.equals(second)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }

        // Write your program here. 
    }
}
