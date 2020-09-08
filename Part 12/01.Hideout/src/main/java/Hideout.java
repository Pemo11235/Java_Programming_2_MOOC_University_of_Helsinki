/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Hideout <T> {
    private T val;
    
    public void putIntoHideout(T toHide){
        this.val = toHide;
    }
    
    public T takeFromHideout() {
        if(val == null){
            return null;
        }
        T temp = val;
        val = null;
        return temp;
    }
    
    public boolean isInHideout(){
        if(val != null){
            return true;
        }
        return false;
    }
}
