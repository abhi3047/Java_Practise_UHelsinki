
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Statistics statistics = new Statistics();
        Statistics first =new Statistics();
        Statistics second=new Statistics();
        Statistics third=new Statistics();

        // user input
        System.out.println("Enter numbers:");
        int evenSum=0;
        int oddSum=0;
        while (true){
            int input=Integer.valueOf(in.nextLine());
            if (input==-1){
                break;
            }else if (input%2==0){
                second.addNumber(input);
//                evenSum=statistics.sum();

            }else if(input%2!=0) {
                third.addNumber(input);
                oddSum = third.sum();
            }
            first.addNumber(input);
        }

        System.out.println("Sum: " + first.sum());
        System.out.println("Sum of even numbers: "+second.sum());
        System.out.println("Sum of odd numbers: "+third.sum());
        System.out.println("Count: "+first.getCount());
        if (first.getCount()>0){
            System.out.println("Average: " +first.average());
        }
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//
//        System.out.println("Average: " + statistics.average());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
