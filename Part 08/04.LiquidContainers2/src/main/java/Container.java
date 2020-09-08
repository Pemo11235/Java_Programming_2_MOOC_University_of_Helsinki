/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Container {

    private int liters;

    public Container() {
        this.liters = 0;
    }

    public int contains() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return this.liters + "/100";
    }

    public boolean isMoreThanHundred(int num) {
        if (this.liters + num > 100) {
            return true;
        }
        return false;
    }

    public boolean isMoreThanZero(int num) {
        if (num > 0) {
            return true;
        }
        return false;
    }

    public void add(int num) {
        if (isMoreThanZero(num)) {
            if (!isMoreThanHundred(num)) {
                this.liters += num;
            } else {
                this.liters = 100;
            }
        }
    }

    public void move(int num, Container second) {
        if (isMoreThanZero(num) && this.liters != 0) {
            if (num > 100) {
                this.remove(100);
                second.add(100);
            } else if (num > this.liters) {
                second.add(this.liters);
                this.remove(this.liters);
                
            } else {
                this.remove(num);
                second.add(num);
            }
        }
    }

    public void remove(int num) {
        if (isMoreThanZero(num) && this.liters != 0) {
            if (num > this.liters) {
                this.liters -= this.liters;
            } else {
                this.liters -= num;
            }
        }
    }
}
