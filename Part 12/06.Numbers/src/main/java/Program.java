
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRandom = howMany(scanner);
        generateRandomNumbers(numRandom);
    }

    public static int howMany(Scanner scanner) {
        System.out.println("How many random numbers should be printed?");
        
        int numRandom = Integer.valueOf(scanner.nextLine());
        return numRandom;
    }

    public static void generateRandomNumbers(int numRandom) {
        Random randomizer = new Random();
        for (int i = 0; i < numRandom; i++) {
            int printRandom = randomizer.nextInt(11);
            System.out.println( printRandom);
        }
    }
}
