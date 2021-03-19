
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int indexOne=Integer.valueOf(in.nextLine());
        int indexTwo=Integer.valueOf(in.nextLine());
        int helper=array[indexOne];
        array[indexOne]=array[indexTwo];
        array[indexTwo]=helper;


        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
