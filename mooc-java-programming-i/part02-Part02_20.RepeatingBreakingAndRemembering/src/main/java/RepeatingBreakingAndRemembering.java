
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        // Declare variables
        int num = 0;
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        double average = 0;

        // Get input
        System.out.print("Give numbers: ");
        while (true) {

            num = Integer.parseInt(reader.nextLine());
            if (num==-1){
                break;
            }
          sum += num;
//            if (num % 2 ==0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
            count++;

        }

        average = (double) sum / count;

        // Display results
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
//        System.out.println("Average: " + average);
//        System.out.println("Even: " + evenCount);
//        System.out.println("Odd: " + oddCount);
    }
}