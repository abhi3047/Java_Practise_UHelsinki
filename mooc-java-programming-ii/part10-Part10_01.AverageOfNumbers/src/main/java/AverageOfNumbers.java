
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items=new ArrayList<>();

        while(true){
            String row=scanner.nextLine();
            if (row.equals("end")){
                break;
            }
            items.add(row);
        }

        double average=items.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        // Write your program here
        System.out.println("average of the numbers: "+average);

    }
}
