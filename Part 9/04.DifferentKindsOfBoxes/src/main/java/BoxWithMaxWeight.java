
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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (!isMaxReach(item.getWeight())) {
            items.add(item);
        }
    }

    @Override
    public void add(String name, int weight) {
        if (!isMaxReach(weight)) {
            items.add(new Item(name, weight));
        }
    }

    
    public boolean isMaxReach(int item) {
        if (sumWeight() + item > this.maxWeight) {
            return true;
        }
        return false;
    }

    public int sumWeight() {
        int sum = 0;
        if (items.size() > 0) {
            for (Item item : items) {
                sum += item.getWeight();
            }
        }

        return sum;
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }

}
