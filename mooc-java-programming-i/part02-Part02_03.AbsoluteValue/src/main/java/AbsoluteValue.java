
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no=Integer.valueOf(in.nextLine());
        if (no<0){
            System.out.println(no*(-1));
        }else {
            System.out.println(no);
        }

    }
}
