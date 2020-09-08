
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            in.add(input);
        }
        
        in.stream()
                .forEach(x -> System.out.println(x));
    }
}
