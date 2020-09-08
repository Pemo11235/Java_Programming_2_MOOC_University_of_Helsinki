
import java.util.HashMap;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class Abbreviations {

    private HashMap<String, String> dir;

    public Abbreviations() {
        this.dir = new HashMap<>();
    }

    public void addAbbreviation(String abb, String exp) {
        //abb = sanitizeString(abb);
        //exp = sanitizeString(exp);
        if (dir.containsKey(abb)) {
            System.out.println("Abbreviations already in!");
        } else {
            dir.put(abb, exp);
        }

    }

    public boolean hasAbbreviation(String abb){
       
        return dir.containsKey(abb);
    }
    
    public String findExplanationFor(String abb){
        if(dir.containsKey(abb)){
            return dir.get(abb);
        }
        return null;
    }
    
    public static String sanitizeString(String in) {
        if (in == null) {
            return "";
        }

        in = in.toLowerCase();
        return in.trim();
    }
}
