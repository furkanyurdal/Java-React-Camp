package gameSimulation.Concrete;

import gameSimulation.Abstract.CustomerCheckService;
import gameSimulation.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println(customer.getFirstName() + " Adl� kullan�c� do�rulanmis." );
		return true;
	}

}
