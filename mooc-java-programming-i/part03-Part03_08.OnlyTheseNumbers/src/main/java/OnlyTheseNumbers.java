
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(in.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where?");
        int first=Integer.valueOf(in.nextLine());
        System.out.println("To where? ");
        int last=Integer.valueOf(in.nextLine());
        for (int i=first;i<=last;i++){
            System.out.println(numbers.get(i));
        }

    }
}
