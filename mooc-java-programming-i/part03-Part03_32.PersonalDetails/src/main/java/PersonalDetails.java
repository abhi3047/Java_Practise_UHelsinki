
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxLength=0;
        String longestName="tom";
        int sum=0;
        int count=0;
        while(true){
            String sentence=in.nextLine();
            if (sentence.equals("")){
                break;
            }
            String[] words=sentence.split(",");
            int lengthOfName=words[0].length();
            if (lengthOfName>maxLength){
                maxLength=lengthOfName;
                longestName=words[0];
            }
            sum+=Integer.valueOf(words[1]);
            count++;
        }
        System.out.println("Longest name: "+longestName);
        double avgYear=(1.0*sum)/count;
        System.out.println("Average of the birth years: "+avgYear);


    }
}
