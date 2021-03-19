import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd(){
        this.herd=new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }


    @Override
    public void move(int dx, int dy) {
        for(Movable item: herd){
            item.move(dx,dy);
        }

    }

    @Override
    public String toString(){
        String text="";
        for(Movable item: herd){
            text= text + item.toString()+"\n";


        }
        return text;
    }
}
