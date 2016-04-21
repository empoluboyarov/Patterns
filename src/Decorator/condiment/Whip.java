package Decorator.condiment;

import Decorator.beverage.Beverage;
import Decorator.condiment.CondimentDecorator;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
