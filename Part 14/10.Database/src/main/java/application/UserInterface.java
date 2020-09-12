package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");
            int idCount = 0;

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Listing the database contents");
                if (!this.database.list().isEmpty()) {
                    for (Todo todo : this.database.list()) {
                        System.out.println(todo);
                    }
                }

            }
            if (command.equals("2")) {
                idCount++;
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String name = this.scanner.nextLine();
                System.out.println("Enter description");
                String description = this.scanner.nextLine();
                Todo todo = new Todo(idCount, name, description, false);
                this.database.add(todo);

            }
            if (command.equals("3")) {
                System.out.println("Which todo should be marked as done (give the id)?");
                int readId = Integer.valueOf(this.scanner.nextLine());
                for (Todo todo : this.database.list()) {
                    if (todo.getId() == readId) {
                        this.database.markAsDone(readId);
                        break;
                    }
                }
            }
            if (command.equals("4")) {
                System.out.println("Which todo should be removed (give the id)?");
                int readId = Integer.valueOf(this.scanner.nextLine());
                
                for (Todo todo : this.database.list()) {
                    if (todo.getId() == readId) {
                        this.database.remove(readId);
                        break;
                    }
                }
            }
        }

        System.out.println("Thank you!");
    }

}
