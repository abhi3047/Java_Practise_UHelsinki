
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            String number=in.nextLine();
            if(number.equals("end")){
                break;
            }
            int no=Integer.valueOf(number);

            System.out.println(no*no*no);
        }


    }
}
