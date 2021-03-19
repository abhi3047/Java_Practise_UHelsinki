import java.util.ArrayList;

public class BackEndFunctionality {
    private UserInterface userInterface;
    private ArrayList<Bird> birdsList;


    public BackEndFunctionality(){
        this.birdsList=new ArrayList<>();
    }

    public void addingBirdsToList(String name){
        String [] birdsInput=name.split(",");
        String birdName=birdsInput[0];
        String birdLatinName=birdsInput[1];
        birdsList.add(new Bird(birdName,birdLatinName));
//        for(Bird bird: birdsList){
//            System.out.println(bird);
//        }
    }


    public void addingObservation(String name){
        int birdMatch=0;
        Bird matchingBird = null;
        for(Bird bird:birdsList){
            if(bird.getBirdName().equals(name)){
               birdMatch=1;
               matchingBird=bird;
            }
        }
        if(birdMatch==1){
            matchingBird.increaseObservationsByOne();

        }else {
            System.out.println("Not a bird!");
        }
    }

  public void printOneBird(String name){
        for(Bird bird:birdsList){
            if (bird.getBirdName().equals(name)){
                System.out.println(bird);
            }
        }
  }

    public void printAllBirds(){
        for(Bird bird:birdsList){
            System.out.println(bird);
        }
    }
}
