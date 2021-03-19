
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println(amount);
            if (command.equals("add")) {
                container1.add(amount);
//
//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//
//        }
            } else if (command.equals("remove")) {
                container2.remove(amount);

            } else if (command.equals("move")) {
                if (container1.contains()>amount) {
                    container1.remove(amount);
                    container2.add(amount);
                } else if (container1.contains()>0){
                    container2.add(container1.contains());
                    container1.remove(container1.contains());
            }
            }
        }
    }
}
