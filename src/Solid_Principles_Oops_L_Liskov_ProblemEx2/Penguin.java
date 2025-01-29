package Solid_Principles_Oops_L_Liskov_ProblemEx2;

public class Penguin extends Bird{
	
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penguin can not fly");
	}

}
