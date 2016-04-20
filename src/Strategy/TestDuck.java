package Strategy;

import Strategy.ducks.Duck;
import Strategy.ducks.MallardDuck;
import Strategy.ducks.ModelDuck;
import Strategy.flybehavior.FlyNoWay;
import Strategy.flybehavior.FlyRocketPower;
import Strategy.quackbehavior.MuteQuack;
import Strategy.quackbehavior.Squeak;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class TestDuck {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.swim();

        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());

        duck.performFly();
        duck.performQuack();


        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();

        model.setQuackBehavior(new Squeak());
        model.setFlyBehavior(new FlyRocketPower());

        model.performQuack();
        model.performFly();
        model.swim();
    }
}
