
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author matte
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            Item newItem = cart.get(product);
            newItem.increaseQuantity();
            cart.put(product, newItem);
        } else {
            cart.put(product, new Item(product, 1, price));
        }

    }

    public int price() {
        int sum = 0;
        for (Item item : cart.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }
}
