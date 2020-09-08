
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
public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> box;


    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();

    }

    @Override
    public double weight() {
        double weight = 0;
        if (box.size() > 0) {
            for (Packable item : box) {
                weight+= item.weight();
            }
        }

        return weight;
    }

    public void add(Packable item) {
        if (!isMaxReached(item)) {
            box.add(item);
            
        }
    }
    
    public Packable pick(int index){
       return box.get(index);
    }

    public boolean isMaxReached(Packable item) {
        if (this.weight()+ item.weight() <= this.maxCapacity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }

}
