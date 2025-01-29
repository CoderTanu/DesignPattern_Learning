package Solid_Principles_Oops_D_Injection;

public class UPIPayment implements PaymentProcessor{

	@Override
	public void processPayment() {
		System.out.println("UPIPayment by Creditcard");
		
	}
}
