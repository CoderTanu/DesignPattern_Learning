package Solid_Principles_Oops_I_Interface_Solution;

public class Chef implements ChefInterface{

	@Override
	public void cokFood() {
		System.out.println("cook food");	
	}

	@Override
	public void decideMenu() {
		System.out.println("decide menu");	
	}

}
