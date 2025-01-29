package Solid_Principles_Oops_L_Liskov_SolutionEx2;

public class Main {
	
	
	
	public static void main(String[] args) {
		Bird s = new Sparrow();
		s.eat();
		((Flyable) s).fly();
		Bird p = new Penguin();
		p.eat();
		
		

	}

	
	

}
