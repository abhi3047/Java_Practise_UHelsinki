
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        while (true){
            String row = scanner.nextLine();
            if (row.equals("")){
                break;
            }
            items.add(row);
        }

        items.stream()
                .forEach(word -> System.out.println(word));

    }
}
