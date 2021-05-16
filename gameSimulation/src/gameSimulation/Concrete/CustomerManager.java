package gameSimulation.Concrete;

import gameSimulation.Abstract.BaseCustomerManager;
import gameSimulation.Abstract.CustomerCheckService;
import gameSimulation.Entities.Customer;

public class CustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Kullanici bilgileri dogrulandi.");
		}else {
			System.out.println("Kullanici dogrulanmadi.");
		}	

	}

	@Override
	public void update(Customer customer) {
		super.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		super.delete(customer);
		
	}
}
