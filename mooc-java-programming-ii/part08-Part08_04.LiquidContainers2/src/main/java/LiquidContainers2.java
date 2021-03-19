
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne=new Container();
        Container containerTwo=new Container();
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);


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
                containerOne.add(amount);
            }else if(command.equals("remove")){
                containerTwo.remove(amount);
            }else if (command.equals("move")) {
                if (amount > 0) {
                    if (containerOne.getCurrentCapacity() >= amount) {
                        containerOne.remove(amount);
                        containerTwo.add(amount);
                    }else {
                        containerTwo.setCurrentCapacity(containerOne.getCurrentCapacity());
                        containerOne.setCurrentCapacity(0);

                    }
                }
            }


            }

        }
    }


