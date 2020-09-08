
import java.util.ArrayList;
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        storageUnits.putIfAbsent(unit, new ArrayList<>());
        storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> list = new ArrayList<>();
        if (storageUnits.containsKey(storageUnit)) {
            list = storageUnits.get(storageUnit);
        }
        return list;
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> listItems = new ArrayList<>();
        if (storageUnits.containsKey(storageUnit)) {
            for (String itemUnit : storageUnits.get(storageUnit)) {
                if (item.equals(itemUnit)) {
                    storageUnits.get(storageUnit).remove(itemUnit);
                    break;
                }
            }
            if (storageUnits.get(storageUnit).isEmpty()) {
                storageUnits.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String unit : storageUnits.keySet()){
            names.add(unit);
        }
        
        return names;
    }
}
