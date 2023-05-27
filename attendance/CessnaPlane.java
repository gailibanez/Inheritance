package attendance;

public class CessnaPlane extends plane{
	int wingsSpan;
	public int getWingsSpan() {
		return wingsSpan;
	}


	public void setWingsSpan(int wingsSpan) {
		this.wingsSpan = wingsSpan;
	}


	CessnaPlane(int speed, String color, int price, int wingsSpan) {
		super(speed, color, price, wingsSpan);
		this.wingsSpan = wingsSpan;
	}
	
	
	@Override
	void Fly(){
		System.out.println("The Cessna Citation CJ4 Plane is Flying");
	}
}
