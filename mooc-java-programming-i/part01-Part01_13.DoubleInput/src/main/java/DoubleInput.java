
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number:");
        double no=Double.valueOf(in.nextLine());
        System.out.println("You gave the number "+no);

        // write your program here

    }
}
