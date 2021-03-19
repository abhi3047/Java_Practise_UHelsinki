
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String sentence = in.nextLine();
            if (sentence.equals("")) {
                break;
            }
            String[] words=sentence.split(" ");
            System.out.println(words[words.length-1]);


        }
    }
}
