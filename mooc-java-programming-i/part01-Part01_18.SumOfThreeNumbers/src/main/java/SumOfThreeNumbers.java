
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the first number:");
        int no1=Integer.valueOf(in.nextLine());
        System.out.println("Give the second number:");
        int no2=Integer.valueOf(in.nextLine());
        System.out.println("Give the third number:");
        int no3=Integer.valueOf(in.nextLine() );
        System.out.println("The sum of the numbers is "+(no1+no2+no3));

        // Write your program here

    }
}
