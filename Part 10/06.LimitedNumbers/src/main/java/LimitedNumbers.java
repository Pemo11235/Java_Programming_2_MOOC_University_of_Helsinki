
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> in = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input < 0){
                break;
            }
            in.add(input);
        }
        
        in.stream().filter(x -> x > 0 && x < 6)
                .forEach(x -> System.out.println(x));
    }
}
