package gameSimulation.Abstract;

import gameSimulation.Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Basariyla kayit oldunuz. : " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Bilgileriniz basariyla güncellendi. : " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Bilgileriniz sistemden silindi.");
		
	}
		
}
