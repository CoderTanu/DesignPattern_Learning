package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
	
	
	EmployeeDao employeeDao;
	
	public EmployeeDaoProxy(){
		employeeDao = new  EmployeeDaoImpl();
	}

	

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDao.create(client, obj);
			return;
		}
		
		throw new Exception("Access Denied");
		
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDao.delete(client,employeeId );
			return;
		}
		
		throw new Exception("Access Denied");
		
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception{
		if(client.equals("USER")|| client.equals("ADMIN")) {
			return employeeDao.get(client,employeeId );
		}
		
		throw new Exception("Access Denied");
	}

}
