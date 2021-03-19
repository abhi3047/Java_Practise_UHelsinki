
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }
//
        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());
        System.out.println(books);


//
        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }


    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {

        for (Book item : books) {
            if (item.getId() == searchedId) {
                return books.indexOf(item);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {


        int startIndex = 0;
        int endIndex = books.size() - 1;
        while (startIndex<endIndex) {
            int middleIndex = middleNo(startIndex, endIndex);
            System.out.println("start: " + startIndex + " end: " + endIndex + " middle: " + middleIndex + " search: " + searchedId);
            int bookID=books.get(middleIndex).getId();
            if (searchedId ==bookID) {
               return middleIndex;
//                return startIndex;

//                System.out.println(startIndex + " , " + endIndex);
//
            }else if (searchedId>bookID){
                startIndex=middleIndex+1;

            }

            else{
                endIndex = middleIndex-1;
//                return endIndex;

//                System.out.println(startIndex + " , " + endIndex);
            }


        }
        return -1;
//        System.out.println(startIndex + ":" + endIndex);

//        if (searchedId==books.get(startIndex).getId()){
//            return startIndex;
//        }else if(searchedId==books.get(endIndex).getId()) {
//            return endIndex;
//        }else {
//            return -1;
//        }
    }


    public static int middleNo(int startIndex, int endIndex) {
        int middleIndex = (startIndex + endIndex) / 2;
        return middleIndex;

    }


}

