
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName=scanner.nextLine();
        try (Scanner in =new Scanner(Paths.get(fileName))){
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String words[] = line.split(",");
                String name = words[0];
                int age = Integer.valueOf(words[1]);
                if (age != 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            }
        }

    }

