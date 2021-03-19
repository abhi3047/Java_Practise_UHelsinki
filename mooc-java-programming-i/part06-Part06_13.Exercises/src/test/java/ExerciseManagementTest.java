import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseManagementTest {


    @Test
    public void checkIfIncreasesByOne(){
        ExerciseManagement management=new ExerciseManagement();
        management.addExercises("new wxercise");
        assertEquals(1,management.getExercises().size());
    }


}



