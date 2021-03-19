
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        while (true){
            int no=Integer.valueOf(in.nextLine());
            if (no==9999){
                break;
            }

            numbers.add(no);
        }
        int smallestNo=numbers.get(0);
        for(int i=1;i<numbers.size();i++){

            if (numbers.get(i)<smallestNo){
                smallestNo=numbers.get(i);
//                System.out.println(smallestNo);


            }
        }
        System.out.println("Smallest number: "+smallestNo);
        for (int i=0;i<numbers.size();i++){
            if (numbers.get(i)==smallestNo){
                System.out.println("Found at index: "+i);
            }

        }






        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
