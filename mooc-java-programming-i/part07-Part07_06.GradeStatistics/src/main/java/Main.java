
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Average average=new Average();
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int inputNo=Integer.valueOf(in.nextLine());
            if (inputNo==-1){
                break;
            }
            average.addNumber(inputNo);
        }
        System.out.println("Point average (all): "+average.calculateAverage());
        if (average.gradeAverage()>0) {
            System.out.println("Point average (passing): " + average.gradeAverage());
            System.out.println("Pass percentage: "+average.passPercentage());
        }else {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }
        System.out.println("Grade distribution:");
        average.star();




    }

}
