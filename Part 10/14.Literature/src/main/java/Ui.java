
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
public class Ui {

    private Scanner scanner;
    private List<Book> books;

    public Ui(Scanner scanner, List<Book> books) {
        this.scanner = scanner;
        this.books = books;
    }

    public void start() {
        while (true) {
            line();
            System.out.print("Input the name of the book, empty stops: ");
            String nameBook = readInput();
            if (itStops(nameBook)) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(readInput());
            addToList(nameBook, age);
        }
    }

    public void printTotal() {
        line();
        System.out.println(this.books.size() + " books in total.");
    }

    public void line() {
        System.out.println("");
    }

    public void printBooks() {
        line();
        ordering();
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String readInput() {
        String toReturn = this.scanner.nextLine();
        return toReturn;
    }

    public Boolean itStops(String in) {
        if (in.equals("")) {
            return true;
        }
        return false;
    }

    public void addToList(String name, int age) {
        if(age<0){
            age = 0;
        }
        this.books.add(new Book(name, age));
    }
    
    public void ordering(){
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRec)
                .thenComparing(Book::getName);
        Collections.sort(books,comparator);
    }
}
