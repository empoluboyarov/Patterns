package Decorator;

import Decorator.beverage.Beverage;
import Decorator.beverage.DarkRoast;
import Decorator.beverage.Espresso;
import Decorator.condiment.Mocha;
import Decorator.condiment.Soy;

/**
 * Created by Evgeniy on 21.04.2016.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.toString());

        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.toString());

        Beverage beverage1 = new Mocha(new Soy(new Espresso()));
        System.out.println(beverage1.toString());

    }
}
