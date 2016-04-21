package Decorator.beverage;

import Decorator.beverage.Beverage;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
