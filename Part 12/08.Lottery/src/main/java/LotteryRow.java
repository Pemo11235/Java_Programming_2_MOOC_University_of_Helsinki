
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random randomizer;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created    
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        this.randomizer = new Random();
        // Implement the random number generation here
        for (int i = 0; i < 7; i++) {
            while (true) {
                int num = this.randomizer.nextInt(40) + 1;
                if (!containsNumber(num)) {
                    this.numbers.add(num);
                    break;
                }
            }

        }
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers      
        return this.numbers.contains(number);
    }
}
