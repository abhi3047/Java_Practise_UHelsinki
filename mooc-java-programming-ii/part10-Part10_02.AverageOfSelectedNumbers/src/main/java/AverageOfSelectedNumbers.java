
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items=new ArrayList<>();

        // toteuta ohjelmasi tänne
        while (true){
            String row=scanner.nextLine();
            if (row.equals("end")){
                break;
            }
            items.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ask=scanner.nextLine();
        double avg=0;
        if(ask.equals("p")){
             avg = items.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(no -> no>0)
                    .average()
                    .getAsDouble();
        }
        else {
             avg = items.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(no -> no<0)
                    .average()
                    .getAsDouble();

        }
        System.out.println("Average of the positive numbers: "+avg);

    }
}
