
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            int in = Integer.valueOf(scanner.nextLine());
            if(in == 0){
                break;
            }
            if(in > 0){
                sum += in;
                count++;
            }                   
        }
        if(count > 0){
            double avg = 1.0*sum/count;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
