package Solid_Principles_Oops_I_Interface_Solution;


/**
 * waiter class do nt need to implements the all interface function bcz these are nt the waiter works
 * solution: make different interface or small module of interface.
 */
public class Waiter implements WaiterInterface{


	@Override
	public void takeOrder() {
	System.out.println("take order");	
	}

	@Override
	public void serverCustomers() {
		System.out.println("server order");	
	}

}
