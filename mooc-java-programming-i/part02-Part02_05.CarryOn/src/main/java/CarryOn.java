
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Carry on?");
            String ans = in.nextLine();
            if (ans.equals("no")) {
                break;

            }

        }
    }
}
