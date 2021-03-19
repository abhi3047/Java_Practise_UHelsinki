
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Where to? ");
        int end=Integer.valueOf(in.nextLine());
        System.out.println("Where from? ");
        int start=Integer.valueOf(in.nextLine());
        if (start<=end) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }



        // Write your program here
    }
}
