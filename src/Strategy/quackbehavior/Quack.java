package Strategy.quackbehavior;

/**
 * Created by Evgeniy on 20.04.2016.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack ! Quack !");
    }
}
