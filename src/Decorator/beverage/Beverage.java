package Decorator.beverage;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " - $" + cost();
    }
}
