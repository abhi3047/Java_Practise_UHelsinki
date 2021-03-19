import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

    private ArrayList<String> exercises;

    public ExerciseManagement(){
        this.exercises=new ArrayList<>();
    }

    public void addExercises(String exerciseName){
        exercises.add(exerciseName);
    }
    public ArrayList<String> getExercises(){
        return exercises;
    }









}
