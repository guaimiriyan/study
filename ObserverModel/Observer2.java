package ObserverModel;

public class Observer2 implements Observer{
	double x;
	double y;
    private Subject positionData;
    public Observer2(Subject p){
    	this.positionData = p;
    }
    public void update(double x,double y){
    	this.x = x;
    	this.y = y;
     System.out.println("o2 find positon have exchange:"+this.x+"  "+this.y);
    }
    
}