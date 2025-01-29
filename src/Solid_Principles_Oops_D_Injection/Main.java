package Solid_Principles_Oops_D_Injection;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor credit = new CreditCardPayment();
		PaymentService  ps = new PaymentService(credit);
		ps.makePayment();
;
	}

}
