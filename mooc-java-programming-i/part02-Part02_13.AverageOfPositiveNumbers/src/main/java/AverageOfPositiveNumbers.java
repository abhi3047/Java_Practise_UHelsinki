
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int attempts=0;
        int sum=0;
        while (true){
            int no=Integer.valueOf(in.nextLine());
            if (no==0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if (no>0){
                attempts=attempts+1;
                sum=sum+no;
            }
        }
        System.out.println((1.0*sum)/attempts);

    }
}
