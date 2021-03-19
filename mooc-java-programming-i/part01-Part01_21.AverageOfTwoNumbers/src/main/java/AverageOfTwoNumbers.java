
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the first number:");
        int no1=Integer.valueOf(in.nextLine());
        System.out.println("Give the second number:");
        int no2=Integer.valueOf(in.nextLine());
//        System.out.println("Give the third number:");
//        int no3=Integer.valueOf(in.nextLine());
        double avg=(no1+(no2*1.0))/2;
        System.out.println("The average is "+avg);

        // Write your program here

    }
}
