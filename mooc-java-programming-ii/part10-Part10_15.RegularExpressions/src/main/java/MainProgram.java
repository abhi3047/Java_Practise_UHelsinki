import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(checker.timeOfDay(text)){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
