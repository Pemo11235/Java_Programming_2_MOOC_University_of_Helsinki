
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class IOU {
    private HashMap<String,Double> register;

    public IOU() {
        this.register = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        if(!isThereYet(toWhom)){
            this.register.put(toWhom, amount);
        }
    }
    
    public boolean isThereYet(String toWhom){
        return this.register.containsKey(toWhom);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.register.getOrDefault(toWhom, 0.0);
    }
}
