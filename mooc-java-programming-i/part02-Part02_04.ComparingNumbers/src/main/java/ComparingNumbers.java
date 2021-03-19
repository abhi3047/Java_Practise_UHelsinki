
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no1= Integer.valueOf(in.nextLine());
        int no2=Integer.valueOf(in.nextLine());
        if (no1> no2){
            System.out.println(no1 + " is greater than "+no2 +".");
        }else if(no1<no2){
            System.out.println(no1 + " is smaller than "+no2 +".");
        }else{
            System.out.println(no1 + " is equal to "+no2 +".");
        }

    }
}
