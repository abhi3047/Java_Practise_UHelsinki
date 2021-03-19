
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Archive> archives=new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = in.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name=in.nextLine();
            if (name.isEmpty()) {
                break;
            }


            Archive archive=new Archive(identifier,name);
            if (!(archives.contains(archive))){
                archives.add(archive);
            }
        }

        System.out.println("==Items==");
        for(Archive items:archives){
            System.out.println(items);
        }

       }





}
