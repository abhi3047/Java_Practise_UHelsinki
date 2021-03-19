
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println(amount);
            if (command.equals("add")) {
                if ((firstContainer + amount) <= 100 && amount >= 0) {
                    firstContainer = firstContainer + amount;
                } else {
                    firstContainer = 100;
                }

            } else if (command.equals("move")) {
//                if (firstContainer > 0 && amount > 0) {
//                    if (firstContainer - amount >= 0) {
//                        firstContainer = firstContainer - amount;
//                        secondContainer = secondContainer + amount;
//                    } else {
//                        firstContainer = 0;
//                        secondContainer = 100;
//                    }
                if (amount>0) {

                    if (firstContainer >= amount && (secondContainer+amount<=100)) {
                        firstContainer = firstContainer - amount;
                        secondContainer = secondContainer + amount;
                    } else {
                        secondContainer = firstContainer;
//                        firstContainer = 0;
                    }
                }


            }else if (command.equals("remove")){
                if (secondContainer-amount>=0){
                    secondContainer=secondContainer-amount;
                }else {
                    secondContainer=0;
                }
            }
        }


    }
}
