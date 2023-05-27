package attendance;

public class bmwe30 extends car {
String tire;
	
	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}

	bmwe30(int speed, String color, int price, String tire) {
		super(speed, color, price);
		this.tire = tire;
		
	}
	
	void drive() {
		System.out.println("The BMW 3 Series E30 is Driving");
	}
}
