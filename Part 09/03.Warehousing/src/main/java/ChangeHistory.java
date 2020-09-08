
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        this.history.removeAll(history);
    }

    @Override
    public String toString() {
        return this.history.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public double maxValue() {
        double max = 0.0;
        if (this.history.size() > 0) {
            for (Double one : this.history) {
                if (one > max) {
                    max = one;
                }
            }
        }
        return max;
    }

    public double minValue() {
        double min = this.history.get(0);
        if (this.history.size() > 0) {
            for (Double one : this.history) {
                if (one < min) {
                    min = one;
                }
            }
        }
        return min;
    }

    public double average() {
        double sum = this.sum();
        int size = this.history.size();
        if(size>0){
            return (double)sum/size;
        }     
        return 0.0;
    }
    
    public double sum(){
        double sum=0.0;
        for(Double one:this.history){
            sum +=one;
        }
        return sum;
    }
}
