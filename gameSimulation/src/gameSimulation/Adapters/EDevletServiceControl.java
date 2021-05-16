package gameSimulation.Adapters;

import gameSimulation.Abstract.CustomerCheckService;
import gameSimulation.Entities.Customer;

public class EDevletServiceControl implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if(customer.getNationalityId().length() == 11 && customer.getFirstName().length() >= 2) {
			return true;
		}else {
			return false;
		}
		
	}

}
