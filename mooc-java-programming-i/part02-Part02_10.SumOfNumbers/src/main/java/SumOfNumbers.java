
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Give a number:");
            int no=Integer.valueOf(in.nextLine());
            if (no==0){
                break;
            }
            sum=sum+no;
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
