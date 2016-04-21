package Decorator.beverage;

import Decorator.beverage.Beverage;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaffeinated coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
