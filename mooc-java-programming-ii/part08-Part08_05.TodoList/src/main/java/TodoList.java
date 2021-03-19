import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDoLists;

    public TodoList(){
        this.toDoLists=new ArrayList<>();
    }

    public void add(String task){
        toDoLists.add(task);
    }
    public void print(){
        int count=1;
        for (String task:toDoLists){
            System.out.println(count+": "+task);
            count++;
        }
    }
    public void remove(int number){
        toDoLists.remove(number-1);
    }

    public ArrayList<String> getToDoLists() {
        return toDoLists;
    }
}
