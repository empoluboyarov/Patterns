package Decorator.beverage;

import Decorator.beverage.Beverage;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
