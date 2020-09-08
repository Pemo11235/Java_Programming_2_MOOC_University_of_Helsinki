
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class MisplacingBox extends Box {

    private ArrayList<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    @Override
    public void add(String name, int weight) {
        this.items.add(new Item(name,weight));
    }

    @Override
    public void add(Item item) {
        this.items.add(item);
    }

}
