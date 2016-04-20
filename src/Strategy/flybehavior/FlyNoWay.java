package Strategy.flybehavior;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" I can not fly ((");
    }
}
