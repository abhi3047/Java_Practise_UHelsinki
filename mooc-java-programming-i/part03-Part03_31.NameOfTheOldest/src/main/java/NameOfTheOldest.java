
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oldestAge=0;
        String oldestPerson="tom";
        while (true){
            String sentence=in.nextLine();
            if (sentence.equals("")){
                break;
            }
            String[] words=sentence.split(",");
            int age =Integer.valueOf(words[1]);
            if (age>oldestAge){
                oldestAge=age;
                oldestPerson=words[0];
            }
        }
        System.out.println("Name of the oldest: "+oldestPerson);


    }
}
