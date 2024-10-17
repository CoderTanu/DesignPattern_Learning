package Solid_Principles_Oops_L_Liskov_Problem;


/**
 * program will break we he narror down the method of parent class
 */
public class Bicycle  implements Bike{

	
	boolean isEngineOn;
	int speed;
	
	
	@Override
	public void trunOnEngine() {
		throw new AssertionError("There is no engine");
	}

	@Override
	public void accelerate() {
		speed =speed +10;
		
	}

}
