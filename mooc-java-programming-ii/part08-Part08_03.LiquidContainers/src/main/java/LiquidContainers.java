
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne=new Container();
        Container containerTwo=new Container();


        while (true) {
            System.out.print("> ");
            System.out.println("First: "+containerOne);
            System.out.println("Second: "+containerTwo);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")){
                containerOne.addAmount(amount);
            }else if(command.equals("remove")){
                containerTwo.removeAmount(amount);
            }else if (command.equals("move")) {
                if (amount > 0) {
                    if (containerOne.getCurrentCapacity() >= amount) {
                        containerOne.removeAmount(amount);
                        containerTwo.addAmount(amount);
                    }else {
                        containerTwo.setCurrentCapacity(containerOne.getCurrentCapacity());
                        containerOne.setCurrentCapacity(0);

                    }
                }
            }


        }
    }

}
