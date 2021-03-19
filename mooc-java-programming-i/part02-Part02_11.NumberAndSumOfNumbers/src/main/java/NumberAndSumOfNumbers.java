
import org.w3c.dom.Attr;

import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int trys=0;
        while (true){
            System.out.println("Give a number:");
            int no=Integer.valueOf(in.nextLine());
            if(no==0){
                break;
            }
            trys=trys+1;
            sum=sum+no;
        }
        System.out.println("Number of numbers: "+trys);
        System.out.println("Sum of the numbers: "+sum);

    }
}
