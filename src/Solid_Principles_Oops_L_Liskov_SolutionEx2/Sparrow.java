package Solid_Principles_Oops_L_Liskov_SolutionEx2;

public class Sparrow extends Bird implements Flyable{
	//sparrow
	@Override
	public void fly() {
		System.out.println("i can fly");
	}
}
