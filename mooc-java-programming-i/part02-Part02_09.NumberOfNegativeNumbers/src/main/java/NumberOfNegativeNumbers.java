
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negatives=0;
        while (true){
            System.out.println("Give a number:");
            int no=Integer.valueOf(in.nextLine());
            if (no==0){
                break;
            }else if (no<0){
                negatives=negatives+1;
            }
        }
        System.out.println("Number of negative numbers: "+negatives);

    }
}
