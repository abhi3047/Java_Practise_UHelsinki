package dictionary;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words-345.txt");
//        dictionary.load();
        dictionary.add("oh","pk");


// use the dictionary

        System.out.println(dictionary.save());


    }
}
