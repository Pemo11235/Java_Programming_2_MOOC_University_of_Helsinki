
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String stringKey : hashmap.keySet()) {
            System.out.println(stringKey);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String stringKey: hashmap.keySet()){
            if(stringKey.contains(text)){
                System.out.println(stringKey);
            }
        }
    }
    
    
public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
      for(String stringKey: hashmap.keySet()){
            if(stringKey.contains(text)){
                System.out.println(hashmap.get(stringKey));
            }
        }
}
}
