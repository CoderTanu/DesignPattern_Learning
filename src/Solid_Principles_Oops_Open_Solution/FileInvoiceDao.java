package Solid_Principles_Oops_Open_Solution;

public class FileInvoiceDao implements InvoiceDao {

	
	Invoice invoice;

	public FileInvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
    public void printInvoice() {
		
	}
	@Override
	public void save(Invoice invoice) {
		// TODO Auto-generated method stub
		
	}
	
}
