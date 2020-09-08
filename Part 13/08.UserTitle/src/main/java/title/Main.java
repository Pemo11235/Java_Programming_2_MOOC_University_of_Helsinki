package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type title: ");
        
        String title = scan.nextLine();
        
        Application.launch(UserTitle.class,
                "--title="+title);

    }

}
