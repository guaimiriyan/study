package FirstModel;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flybehavior = new FlyWithWings();
	}
	public void performFly(){
		quackBehavior.quack();
	}
	public void performQuack(){
		flybehavior.fly();
	}
	public void display(){
		System.out.println("I'm green head");
	}
	public void SetFlyBehavior(FlyBehavior f){
		this.flybehavior = f;
	}
	public void SetQuackBehavior(QuackBehavior q){
		this.quackBehavior = q;
	}

}
