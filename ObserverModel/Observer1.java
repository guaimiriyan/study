package ObserverModel;

public class Observer1 implements Observer{
	double x;
	double y;
    private Subject positionData;
    public Observer1(Subject p){
    	this.positionData = p;
    }
    public void update(double x,double y){
    	this.x = x;
    	this.y = y;
     System.out.println("o1 find positon have exchange:"+this.x+"  "+this.y);
    }
    
}
