package Decorator.beverage;

import Decorator.beverage.Beverage;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
