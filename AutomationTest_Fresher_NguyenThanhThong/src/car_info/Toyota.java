package car_info;

public class Toyota extends Car {
	private long maxSpeed = 100;
	
	@Override
	public void run() {
		System.out.println("----------BMW MAXSPEED---------");
		for (int i=0; i<=9; i++) {
			System.out.println("Max speed = "+ maxSpeed);
		}
	}
}
