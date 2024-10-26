package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, EmployeeDo obj) {
		System.out.println("employe table row is created");
	}

	@Override
	public void delete(String client, int employeeId) {
		System.out.println("employe table row is deleted");
	}

	@Override
	public EmployeeDo get(String client, int employeeId) {
		System.out.println("get employe table");
		return new EmployeeDo();
	}

}
