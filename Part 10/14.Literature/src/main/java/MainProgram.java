
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        Ui ui = new Ui(scanner,books);
        
       ui.start();
       ui.printTotal();
       ui.printBooks();
    }

}
