
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a string:");
        String text=in.nextLine();
        System.out.println("Give an integer:");
        int no=Integer.valueOf(in.nextLine());
        System.out.println("Give a double:");
        double dec=Double.valueOf(in.nextLine());
        System.out.println("Give a boolean:");
        boolean bl=Boolean.valueOf(in.nextLine());
        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+no);
        System.out.println("You gave the double "+dec);
        System.out.println("You gave the boolean "+bl);

        // Write your program here

    }
}
