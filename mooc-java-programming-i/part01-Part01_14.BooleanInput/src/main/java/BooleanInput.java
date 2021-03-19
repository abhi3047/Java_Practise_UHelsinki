
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write something:");
        boolean word=Boolean.valueOf(in.nextLine());
        System.out.println("True or false? "+word);

        // write your program here

    }
}
