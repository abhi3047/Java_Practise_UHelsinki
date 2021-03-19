
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        while (true){
            String word=in.nextLine();
            if (word.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
