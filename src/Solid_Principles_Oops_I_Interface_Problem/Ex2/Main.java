package Solid_Principles_Oops_I_Interface_Problem.Ex2;

public class Main {

	public static void main(String[] args) {
		Printer p = new BasePrinter();
		p.print();
		
		AllInOnePrinter s = new AllInOnePrinter();
		s.scan();
		s.print();

	}

}
