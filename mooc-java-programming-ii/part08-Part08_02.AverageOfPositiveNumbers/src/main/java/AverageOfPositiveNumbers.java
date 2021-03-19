
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        double count=0;
        while(true){
//            System.out.println();
            int inputNo=Integer.valueOf(in.nextLine());
            if (inputNo==0){
                break;
            }

            if(inputNo>0){
                sum+=inputNo;
                count++;

            }
        }
        if (sum>0){
            double avg=sum/count;
            System.out.println(avg);

        }else{
            System.out.println("Cannot calculate the average");
        }


    }
}
