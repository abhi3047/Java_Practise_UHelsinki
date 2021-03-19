
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner in=new Scanner(Paths.get(file))){
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] words = line.split(",");
                String name = words[0];
                int age = Integer.valueOf(words[1]);
                persons.add(new Person(name, age));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//        persons.add(new Person(n))

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
