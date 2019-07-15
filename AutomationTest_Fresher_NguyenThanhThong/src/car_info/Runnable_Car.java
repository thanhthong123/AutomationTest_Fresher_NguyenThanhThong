package car_info;

public class Runnable_Car implements Runnable {
	private Thread t;
    private String threadName;
    private Car vehicle;
    
    //Constructor
    public Runnable_Car() {};
    
    //Constructor
    public Runnable_Car(String name, Car brand) {
        threadName = name;
        vehicle = brand;
        //System.out.println("Creating " + threadName);
    }
    

	@Override
	public void run() {
		 synchronized(vehicle) {
			 vehicle.run();
	      }
		
		// vehicle.run();
	    // System.out.println("Thread " +  threadName + " exiting.");	       
	}
	
	public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
