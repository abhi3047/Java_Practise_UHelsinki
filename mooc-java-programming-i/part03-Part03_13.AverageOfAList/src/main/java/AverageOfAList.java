
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        while (true){
            int no=Integer.valueOf(in.nextLine());
            if (no==-1){
                break;
            }
            numbers.add(no);
        }
        int sum=0;
        for (int i:numbers){
            sum+=i;
        }
        System.out.println("Average: "+(1.0*sum)/numbers.size());


        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
