package Strategy.ducks;

import Strategy.flybehavior.FlyWithWings;
import Strategy.quackbehavior.Quack;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real mallard duck!");
    }
}
