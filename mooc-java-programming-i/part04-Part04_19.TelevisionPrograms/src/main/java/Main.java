import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Name: ");
            String name=in.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int duration=Integer.valueOf(in.nextLine());
            programs.add(new TelevisionProgram(name,duration));

        }
        System.out.println("Program's maximum duration? ");
        int maxLimit=Integer.valueOf(in.nextLine());
        for (TelevisionProgram prgm:programs){
            if (prgm.getDuration()<=maxLimit){
                System.out.println(prgm);
            }
        }

    }
}
