import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Book> books=new ArrayList<>();
        while (true){
            System.out.println("Title: ");
            String title=in.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages=Integer.valueOf(in.nextLine());
            System.out.println("Publication year: ");
            int pubYear=Integer.valueOf(in.nextLine());
            books.add(new Book(title,pages,pubYear));
        }
        System.out.println("What information will be printed? ");
        String response=in.nextLine();
        if (response.equals("everything")){
            for (Book item : books) {
                System.out.println(item);

            }
        }else if (response.equals("name")){
            for (Book item : books) {
                System.out.println(item.getTitle());

            }

        }
        }

        }

        
        // implement here the program that allows the user to enter 
        // book information and to examine them



