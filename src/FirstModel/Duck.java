package FirstModel;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackBehavior;
	public abstract void display();
	public abstract void performQuack();
	public abstract void performFly();
}
