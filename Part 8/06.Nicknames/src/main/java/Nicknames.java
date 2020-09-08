
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> obj = new HashMap<>();
        obj.put("matthew","matt");
        obj.put("michael","mix");
        obj.put("arthur", "artie");
        System.out.println(obj.get("matthew"));
    }

}
