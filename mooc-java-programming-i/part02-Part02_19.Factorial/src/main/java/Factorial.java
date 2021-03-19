
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number: ");
        int no=Integer.valueOf(in.nextLine());
        int fact=1;
        for (int i=no;i >=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
}
