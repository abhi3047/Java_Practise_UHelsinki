
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }



    }
}