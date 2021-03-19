
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        printNumbersInRange(numbers,3,10);
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in the range ["+lowerLimit+", "+upperLimit+"]");

        for (int no:numbers){
            if ((no>=lowerLimit) && (no<=upperLimit)){
                System.out.println(no);
            }
        }
    }
    
}
