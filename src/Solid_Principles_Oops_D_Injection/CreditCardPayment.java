package Solid_Principles_Oops_D_Injection;

public class CreditCardPayment implements PaymentProcessor{

	@Override
	public void processPayment() {
		System.out.println("Payment by Creditcard");
		
	}

}
