package Solid_Principles_Oops_I_Interface_Problem.Ex2;

public class AllInOnePrinter implements Printer , Scanner{

	@Override
	public void print() {
		System.out.println("can print");
	}

	@Override
	public void scan() {
		System.out.println("can  scan");
		
	}

}
