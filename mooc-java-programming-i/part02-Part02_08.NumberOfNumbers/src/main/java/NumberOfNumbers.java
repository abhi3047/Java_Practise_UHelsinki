
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trys=0;
        while (true){
            System.out.println("Give a number:");
            int no=Integer.valueOf(in.nextLine());
            if(no==0){
                break;
            }
            trys=trys+1;

        }
        System.out.println("Number of numbers: "+trys);

    }
}
