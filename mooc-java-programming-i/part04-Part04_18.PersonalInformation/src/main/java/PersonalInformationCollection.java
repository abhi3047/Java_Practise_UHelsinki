
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("First name: ");
            String firstName=in.nextLine();
            if (firstName.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String lastName=in.nextLine();
            System.out.println("Identification number: ");
            String identificationNumber=in.nextLine();
            infoCollection.add(new PersonalInformation(firstName,lastName,identificationNumber));
        }
        for (PersonalInformation info:infoCollection) {
            System.out.println(info.getFirstName() +" "+info.getLastName());
        }

    }
}
