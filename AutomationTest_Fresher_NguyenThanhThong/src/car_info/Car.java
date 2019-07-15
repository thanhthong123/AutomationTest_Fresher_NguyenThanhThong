package car_info;

public abstract class Car {
	private int wheels = 4; // the car wheel number 
	private int doors = 4;  // the car door number
	private int seats = 5; 	// the car seat number
	private long maxSpeed; // mas speed of car
	
	
	
	
	public abstract void run();
	
	public void info() {
		System.out.println("Wheels = " + wheels);
		System.out.println("Doors = " + doors);
		System.out.println("Seats = " + seats);
		System.out.println("Max speed = " + maxSpeed);
	}

}
