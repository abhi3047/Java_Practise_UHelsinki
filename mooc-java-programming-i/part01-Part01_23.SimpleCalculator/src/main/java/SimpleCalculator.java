
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the first number:");
        int no1=Integer.valueOf(in.nextLine());
        System.out.println("Give the second number:");
        int no2=Integer.valueOf(in.nextLine());
        System.out.println(no1+" + "+no2+" = "+(no1+no2));
        System.out.println(no1+" - "+no2+" = "+(no1-no2));
        System.out.println(no1+" * "+no2+" = "+(no1*no2));
        System.out.println(no1+" / "+no2+" = "+((1.0*no1)/no2));


        // Write your program here

    }
}
