
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        UserInterface userInterface=new UserInterface(scan);
        BackEndFunctionality backEnd=new BackEndFunctionality();


        while (true) {
            System.out.println("?");

            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                String inputFromAdd=userInterface.inputFromAdd();
                backEnd.addingBirdsToList(inputFromAdd);
            }else if(command.equals("Observation")){
                String birdName=userInterface.inputFromObservation();
                backEnd.addingObservation(birdName);


            }else if(command.equals("All")){
                backEnd.printAllBirds();
            } else if(command.equals("One")){
                String BirdName=userInterface.birdforOnePrint();
                backEnd.printOneBird(BirdName);

            }


        }


    }




    }


