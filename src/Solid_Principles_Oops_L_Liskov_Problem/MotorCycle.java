package Solid_Principles_Oops_L_Liskov_Problem;

public class MotorCycle  implements Bike{
	
	boolean isEngineOn;
	int speed;

	@Override
	public void trunOnEngine() {
		isEngineOn= true;
		
	}

	@Override
	public void accelerate() {
		speed =speed +20;
	}

}
