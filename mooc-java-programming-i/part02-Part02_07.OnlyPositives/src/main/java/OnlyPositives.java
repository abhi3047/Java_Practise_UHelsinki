
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int no=Integer.valueOf(in.nextLine());
            if (no<0){
                System.out.println("Unsuitable number");
                continue;
            }else if (no==0){
                break;
            }else {
                System.out.println(no*no);
            }
        }

    }
}
