
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Last number? ");
        int sum=0;
        int no =Integer.valueOf(in.nextLine());
        for (int i=1;i<=no;i++){
            sum=sum+i;
        }
        System.out.println("The sum is "+sum);
    }
}
