
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Write a message: ");
        String msg=in.nextLine();
        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);
    }
}
