package attendance;

public class YamahaBoat extends boat {
	String MainSailColor;
	public String getMainSailColor() {
		return MainSailColor;
	}
	public void setMainSailColor(String mainSailColor) {
		MainSailColor = mainSailColor;
	}
	YamahaBoat(int speed, String color, int price,String MainSailColor) {
		super(speed, color, price);
		this.MainSailColor = MainSailColor;
		
	}
	@Override
	void Float () {
		System.out.println("The Yamaha High Speed Boat 1202 is floating");
	}
}