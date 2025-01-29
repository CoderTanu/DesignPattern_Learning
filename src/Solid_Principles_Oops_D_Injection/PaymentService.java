package Solid_Principles_Oops_D_Injection;

public class PaymentService {
	
	private PaymentProcessor paymentProcessor;

	public PaymentService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
	
	public void makePayment() {
		paymentProcessor.processPayment();
	}
	
	

}
