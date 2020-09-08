
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            String cmd = askCommand();
            if (cmd.equals("stop")) {
                break;
            }

            if (cmd.equals("add")) {
                add();
            }

            if (cmd.equals("list")) {
                list();
            }
            
            if (cmd.equals("remove")) {
                remove();
            }
        }
    }

    public String askWord() {
        String word = scanner.nextLine();
        return word;
    }

    public String askCommand() {
        System.out.print("Command: ");
        String cmd = askWord();
        return cmd;
    }

    public void add() {
        System.out.print("To add: ");
        String toAdd = askWord();
        list.add(toAdd);
    }

    public void list() {
        list.print();
    }
    
    public void remove(){
        int num = Integer.valueOf(askWord());
        list.remove(num);
    }
}
