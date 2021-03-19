
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no=Integer.valueOf(in.nextLine());
        for (int i=no;i<=100;i++){
            System.out.println(i);
        }

    }
}
