import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> listOfAddInputs;
    public UserInterface(Scanner scanner){
        this.scanner=scanner;
        this.listOfAddInputs=new ArrayList<>();

    }

    public ArrayList<String> getListOfBirds() {
        return listOfAddInputs;
    }

    public void setListOfBirds(ArrayList<String> listOfBirds) {
        this.listOfAddInputs = listOfBirds;
    }

    public String inputFromAdd(){
//        String addInput="";
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Name in Latin:");
        String birdLatinName = scanner.nextLine();
        String addInput=birdName+","+birdLatinName;
//        System.out.println(addInput);
        return addInput;

    }

    public String inputFromObservation(){
        System.out.println("Bird? ");
       String addInput=scanner.nextLine();
       return addInput;

    }

    public String birdforOnePrint(){
        System.out.println("Bird? ");
        String name=scanner.nextLine();
        return name;
    }

    public String returningInputs() {
        String addInput="";
        while (true) {
            System.out.println("?");

            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                System.out.print("Name in Latin:");
                String birdLatinName = scanner.nextLine();
                addInput=birdName+","+birdLatinName;
                System.out.println(addInput);
            }else if(command.equals("Observation")){
                System.out.println("Bird? ");
                addInput=scanner.nextLine();
            }


        }
        return addInput;

    }


}
