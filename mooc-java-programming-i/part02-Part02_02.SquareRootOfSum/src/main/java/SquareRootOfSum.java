
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no1=Integer.valueOf(in.nextLine());
        int no2=Integer.valueOf(in.nextLine());
        int sum=no1 + no2;
        double result=Math.sqrt(sum);
        System.out.println((int)result);

    }
}
