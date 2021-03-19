
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList <Integer> numbers =new ArrayList<>();
        int count=0;
        try(Scanner in=new Scanner(Paths.get(file))) {
            while (in.hasNextLine()){
                int no=Integer.valueOf(in.nextLine());
                numbers.add(no);

            }
            for (int item:numbers){
                if (item>=lowerBound && item<=upperBound){
                    count++;

                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Numbers: "+count);


    }

}
