package Solid_Principles_Oops_Open_Solution;

public class DatabaseInvoiceDao  implements InvoiceDao {
	
	Invoice invoice;

	public DatabaseInvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}

@Override
public void save(Invoice invoice) {
	// TODO Auto-generated method stub
	
}
	

}
