
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        // test your method here
        System.out.println("Insert numbers. \"end\" to stop.");
        while(true){
            String in = scanner.nextLine();
            if(in.equals("end")){
                break;                     
            }
            numbers.add(Integer.valueOf(in));
        }
        List<Integer> pos =  positive(numbers);
        System.out.println(pos);
    }

     public static List<Integer> positive(List<Integer> numbers){
         ArrayList<Integer> pos = numbers.stream()
                 .filter(num -> num > 0)              
                 .collect(Collectors.toCollection(ArrayList::new));
         return pos;
     }
}
