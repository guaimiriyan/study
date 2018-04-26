package ObserverModel;

import java.util.ArrayList;

public class PositionData implements Subject{
	private double x;
	private double y;
	private ArrayList<Observer> Observer;
	public PositionData(){
		Observer = new ArrayList<>();
	}
   public void removeObserver(Observer o){
	   int i = Observer.indexOf(o);
	   if(i>=0){
		   Observer.remove(i);
	   }
   }
   public void registerObserver(Observer o){
	   Observer.add(o);
   }
   public void notifyObserver(){
	   if(Observer.size()>0){
		   for(Observer a:Observer){
			   a.update(x, y);
		   }
	   }else{
		  System.out.println("no Observer!"); 
	   }
   }
   public void changePosition(){
	   notifyObserver();
   }
   public void SetPosition(double d,double e){
	   this.x = d;
	   this.y = e;
	   changePosition();
   }
}
