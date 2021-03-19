
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oldestAge=0;
        while (true){
            String sentence=in.nextLine();
            if (sentence.equals("")){
                break;
            }
            String[] words=sentence.split(",");
            int age=Integer.valueOf(words[1]);
            if (age>oldestAge){
                oldestAge=age;
            }
        }
        System.out.println("Age of the oldest: "+oldestAge);

    }
}
