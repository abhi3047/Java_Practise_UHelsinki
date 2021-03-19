
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days=Integer.valueOf(in.nextLine());
        int total_seconds=days*24*3600;
        System.out.println(total_seconds);

        // Write your program here

    }
}
