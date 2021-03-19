
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("First number? ");
        int start=Integer.valueOf(in.nextLine());
        System.out.println("Last number? ");
        int end=Integer.valueOf(in.nextLine());
        int sum=start;
        for (int i=start+1;i<=end;i++){
            sum =sum+i;
//            System.out.println(sum);

        }
        System.out.println("The sum is: "+sum);
    }
}
