
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the first number:");
        int no1=Integer.valueOf(in.nextLine());
        System.out.println("Give the second number:");
        int no2=Integer.valueOf(in.nextLine());
        if (no1>no2){
            System.out.println("Greater number is: "+no1);
        }else if(no1==no2){
            System.out.println("The numbers are equal!");
        }else {
            System.out.println("Greater number is: "+no2);
        }

    }
}
