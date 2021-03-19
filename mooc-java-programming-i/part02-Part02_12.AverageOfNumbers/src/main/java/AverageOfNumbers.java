
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int attempts = 0;
        while (true) {
            System.out.println("Give a number:");
            int no = Integer.valueOf(in.nextLine());
            if (no == 0) {
                break;
            }
            attempts = attempts + 1;
            sum = sum + no;
        }
        double avg = (1.0*sum) / attempts;
        System.out.println("Average of the numbers: " + avg);


    }
}
