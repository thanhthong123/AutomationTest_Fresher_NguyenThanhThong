package car_info;

public class Question_2_Main {
	

	public static void main(String[] args) {
		Car toyota = new Toyota();
		Car bmw = new BMW();
		
		Runnable_Car r1 = new Runnable_Car("toyota", toyota);
        r1.start();
 
        Runnable_Car r2 = new Runnable_Car("bmw", bmw);
        r2.start();
         
        
	}

}
