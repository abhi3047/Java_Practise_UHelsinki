package dictionary;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary=new HashMap<>();
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            return translation;
        }
        return null;
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            dictionary.remove(translation);
            dictionary.remove(word);
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                add(parts[0],parts[1]);
           }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try  {
            ArrayList<String> usedWords = new ArrayList<>();
            PrintWriter writer = new PrintWriter(file);
            for (String word : dictionary.keySet()) {
                String translated = dictionary.get(word);
                usedWords.add(translated);
                if (!usedWords.contains(word)){
                    writer.println(word+":"+dictionary.get(word));
                }

            }
            writer.close();
            return true;
        }catch (Exception e) {
            return false;
        }
    }


    public String toString(){
        String text="";
        for(String word:dictionary.keySet()){
            text+=word+":"+dictionary.get(word)+"\n";
        }
        return text;
    }
}
