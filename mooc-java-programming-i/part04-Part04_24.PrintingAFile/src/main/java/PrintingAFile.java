
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner in=new Scanner(Paths.get("data.txt"))){
            while (in.hasNextLine()){
                String word=in.nextLine();
                System.out.println(word);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
