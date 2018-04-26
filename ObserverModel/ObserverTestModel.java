package ObserverModel;

public class ObserverTestModel {
	public static void main(String[] args) {
		PositionData positiondata = new PositionData();
		Observer o1 = new Observer1(positiondata);
		Observer o2 = new Observer2(positiondata);
		positiondata.registerObserver(o1);
		positiondata.registerObserver(o2);
		positiondata.SetPosition(1.2, 2.2);
		positiondata.SetPosition(2.4444, 5.4444);
	}
}
