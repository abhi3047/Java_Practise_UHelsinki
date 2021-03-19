import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDo;

    public TodoList(){
        this.toDo=new ArrayList<>();
    }

    public void add(String task){
        this.toDo.add(task);
    }

    public void print(){
        for(String item:toDo){
            System.out.println((toDo.indexOf(item)+1)+": "+item);
        }
    }

    public void remove(int number){
        toDo.remove(number-1);
    }
}
