package ProxyDesignPattern;

public class ProxyDesignPatternMain {

	public static void main(String[] args){
		EmployeeDao EmployeeDao = new EmployeeDaoProxy();
		try {
			EmployeeDao.create("USER", new EmployeeDo());
			EmployeeDao.delete("ADMIN", 1);
			EmployeeDao.get("ADMIN",1);
			System.out.println("Operation successfull");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
