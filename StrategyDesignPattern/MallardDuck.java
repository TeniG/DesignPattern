import DuckBehaviour.FlyWithWings;
import DuckBehaviour.Quack;

public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
       System.out.println("I am a Mallard Duck - Static Behaviour set in Constructor ");
    }
    
}
