package attendance;

public class main {

	public static void main(String[] args) {
		bmwe30 bmw = new bmwe30(228,"Orange",650000,"195/65R14 Michelin MXV3A");
		System.out.println("BMW 3 Series E30");
		System.out.println("Speed: "+ bmw.speed);
		System.out.println("Color: "+ bmw.color);
		System.out.println("Price: "+ bmw.price +"$");
		System.out.println("Tire: "+ bmw.tire);
		bmw.drive();
		bmw.Stop();
		
		CessnaPlane cp = new CessnaPlane(717,"White",3000000,30);
		System.out.println("");
		System.out.println("Cessna Citation CJ4");
		System.out.println("Speed: "+ cp.speed);
		System.out.println("Color: "+ cp.color);
		System.out.println("Price: "+ cp.price +"$");
		System.out.println("Wings Span: "+ cp.wingsSpan);
		cp.Fly();
		cp.Stop();

		YamahaBoat yb = new YamahaBoat(50,"Black",100000,"Rainbow");
		System.out.println("");
		System.out.println("Yamaha High Speed Boat 1202");
		System.out.println("Speed: "+ yb.speed);
		System.out.println("Color: "+ yb.color);
		System.out.println("Price: "+ yb.price +"$");
		System.out.println("Wings Span: "+ yb.MainSailColor);
		yb.Float();
		yb.Stop();

}
}
