
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (cmd.equals("add")) {
                first.add(amount);
            }

            if (cmd.equals("move")) {
                first.move(amount, second);
            }

            if (cmd.equals("remove")) {
                second.remove(amount);
            }
        }
    }

}
