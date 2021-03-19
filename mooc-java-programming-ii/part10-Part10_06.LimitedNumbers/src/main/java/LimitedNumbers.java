
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();
        while (true){
            int no = Integer.valueOf(scanner.nextLine());
            if (no<0){
                break;
            }
            items.add(no);
        }

        items.stream()
                .filter(no -> (no >=1) && (no <=5))
                .forEach(no -> System.out.println(no));
    }
}
