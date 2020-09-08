/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Book {

    private String name;
    private int ageRec;

    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public int getAgeRec() {
        return ageRec;
    }

    public String getName() {
        return name;
    }

    public void setAgeRec(int ageRec) {
        this.ageRec = ageRec;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRec + " years-olds or older)";
    }

}
