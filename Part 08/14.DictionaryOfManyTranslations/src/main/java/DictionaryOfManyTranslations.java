
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {

        dictionary.putIfAbsent(word, new ArrayList<String>());
        dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> list = new ArrayList<>();
        if(dictionary.containsKey(word)){
            list = dictionary.get(word);
        }
        
        return list;
    }
    
    public void remove(String word) {
        if(dictionary.containsKey(word)){
            dictionary.remove(word);
        }
    }
}
