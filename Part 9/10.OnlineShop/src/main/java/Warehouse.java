
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class Warehouse {

    private Map<String, Integer> warehousePrices;
    private Map<String, Integer> warehouseStocks;

    public Warehouse() {
        this.warehousePrices = new HashMap<>();
        this.warehouseStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        warehousePrices.put(product, price);
        warehouseStocks.put(product, stock);
    }

    public int price(String product) {
        return warehousePrices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return warehouseStocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (warehouseStocks.containsKey(product)) {
            if (stock(product) > 0) {
                warehouseStocks.put(product, stock(product) - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> productsSet = warehouseStocks.keySet();
        return productsSet;
    }
}
