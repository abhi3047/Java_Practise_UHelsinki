import java.util.Scanner;

public class TextUI {

    private Scanner in;
    private SimpleDictionary dictionary;

    public TextUI(Scanner in,SimpleDictionary dictionary){
        this.in=in;
        this.dictionary=dictionary;
    }

    public void start(){
        while (true) {
            System.out.print("Command:");
            String word = in.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;

            }else if(word.equals("add")){
                System.out.print("Word:");
                String wordToAdd=in.nextLine();
                System.out.print("Translation: ");
                String wordToTranslate= in.nextLine();
                dictionary.add(wordToAdd,wordToTranslate);

            }else if (word.equals("search")){
                System.out.print("To be translated: ");
                String wordToBeTranslated=in.nextLine();
                if (dictionary.isPresent(wordToBeTranslated)){
                    System.out.println("Translation: "+dictionary.translate(wordToBeTranslated));

                }else{
                    System.out.println("Word "+wordToBeTranslated+" was not found");
                }

            }
            else{
                System.out.println("Unknown command");
            }
        }

    }

}
