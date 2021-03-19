import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner in;


    public UserInterface(TodoList list, Scanner in){
        this.list=list;
        this.in=in;
    }

    public void start(){
        while (true){
            System.out.print("Command:");
            String wordEntered=in.nextLine();
            if (wordEntered.equals("stop")){
                break;
            }else if(wordEntered.equals("add")){
                System.out.print("To add: ");
                String taskToAdd=in.nextLine();
                list.add(taskToAdd);

            }else if (wordEntered.equals("list")){
                list.print();
            }else if (wordEntered.equals("remove")){
                System.out.print("Which one is removed?");
                int taskToRemove=Integer.valueOf(in.nextLine());
                list.remove(taskToRemove);
            }
        }
    }
}
