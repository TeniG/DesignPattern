import DuckBehaviour.FlyWithWings;
import DuckBehaviour.Squeak;

public class SimulatorDuckApp {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println(" ---- Runtime Fly and Quack Behaviour ---");
         Duck rMallardDuck = new MallardDuckRuntimeBehaviour();
        rMallardDuck.display();
        rMallardDuck.setFlyBehaviour(new FlyWithWings());
        rMallardDuck.performFly();
        rMallardDuck.setQuackBehaviour(new Squeak());
        rMallardDuck.performQuack();
    }
    
}
