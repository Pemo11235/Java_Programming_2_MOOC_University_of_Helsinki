package dictionary;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
      
        
        dictionary.save();
    }
}
