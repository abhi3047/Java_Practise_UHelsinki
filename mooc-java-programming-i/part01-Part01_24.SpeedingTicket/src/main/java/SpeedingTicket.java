
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed=Integer.valueOf(in.nextLine());
        if(speed>120){
            System.out.println("Speeding ticket!");
        }

        // Write your program here. 
    }
}
