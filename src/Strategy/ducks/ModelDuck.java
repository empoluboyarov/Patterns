package Strategy.ducks;

import Strategy.flybehavior.FlyNoWay;
import Strategy.quackbehavior.Quack;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
