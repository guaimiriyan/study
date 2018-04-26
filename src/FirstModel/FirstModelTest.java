package FirstModel;

public class FirstModelTest {
  public static void main(String[] args) {
	MallardDuck mallardDuck = new MallardDuck();
	mallardDuck.display();
	mallardDuck.performFly();
	mallardDuck.performQuack();
	System.out.println("change.....");
	FlyBehavior f = new FlyNoWay();
	QuackBehavior q =new Squack();
	mallardDuck.SetFlyBehavior(f);
	mallardDuck.SetQuackBehavior(q);
	mallardDuck.display();
	mallardDuck.performFly();
	mallardDuck.performQuack();
}
}
