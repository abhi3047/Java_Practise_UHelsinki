
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            String word=in.nextLine();
            if (word.equals("")){
                break;
            }
            String[] words=word.split(" ");
            for(String text:words){
                System.out.println(text);
            }

        }




    }
}
