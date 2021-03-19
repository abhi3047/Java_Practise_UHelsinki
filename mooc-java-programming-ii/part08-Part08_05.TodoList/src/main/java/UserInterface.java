import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoLists;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoLists=todoList;
        this.scanner=scanner;
    }


        public void start() {
            while (true) {
                System.out.print("Command: ");
                String command = scanner.nextLine();
                if (command.equals("add")) {
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    todoLists.add(task);

                } else if (command.equals("list")) {
                    todoLists.print();
                } else if (command.equals("remove")) {
                    System.out.print("Which one is removed?");
                    int numberToDelete = Integer.valueOf(scanner.nextLine());
                    todoLists.remove(numberToDelete);

                } else if (command.equals("stop")) {
                    break;
                }
            }


        }
    }

