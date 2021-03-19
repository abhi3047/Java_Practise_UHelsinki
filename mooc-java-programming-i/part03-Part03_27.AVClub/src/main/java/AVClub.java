
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            String sentence=in.nextLine();
            if (sentence.equals("")){
                break;
            }
            String[] words=sentence.split(" ");
            for (String word:words){
                if (word.contains("av")){
                    System.out.println(word);
                }
            }

        }


    }
}
