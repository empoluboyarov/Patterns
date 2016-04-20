package Strategy.flybehavior;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am fly how like a rocket");
    }
}
