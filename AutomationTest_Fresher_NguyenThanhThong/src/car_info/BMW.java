package car_info;

public class BMW extends Car {
	
	private long maxSpeed = 200;
	
	@Override
	public void run() {
		System.out.println("----------TOYOTA MAXSPEED---------");
		for (int i=0; i<=9; i++) {
			System.out.println("Max speed = "+ maxSpeed);
		}
	}
	
}
