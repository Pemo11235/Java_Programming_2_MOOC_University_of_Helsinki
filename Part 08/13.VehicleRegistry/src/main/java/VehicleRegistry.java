
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> reg;

    public VehicleRegistry() {
        this.reg = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!reg.containsKey(licensePlate)) {
            reg.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return reg.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
         if(reg.containsKey(licensePlate)){
             reg.remove(licensePlate);
             return true;
         }
         return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate license : reg.keySet()){
            System.out.println(license);
        }
    }
    
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(String name : reg.values()){
            if(!names.contains(name)){
                names.add(name);
            }
        }
        
        for(String name:names){
            System.out.println(name);
        }
    }
}
