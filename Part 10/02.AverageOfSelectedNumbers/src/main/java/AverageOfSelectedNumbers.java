
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("end")) {
                break;
            }
            numbers.add(in);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ans = scanner.nextLine();
        if (ans.equals("n")) {
            double negativeAv = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: " + negativeAv);
        }

        if (ans.equals("p")) {
            double positiveAv = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: " + positiveAv);
        }
    }
}
