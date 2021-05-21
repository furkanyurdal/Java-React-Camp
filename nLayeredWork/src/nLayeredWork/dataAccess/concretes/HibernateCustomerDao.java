package nLayeredWork.dataAccess.concretes;

import nLayeredWork.dataAccess.abstracts.CustomerDao;

import java.util.ArrayList;
import java.util.List;
import nLayeredWork.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	
	List<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer) {
		System.out.println("Veritabanina basariyla eklendi " + customer.getFirstName());
		customers.add(customer);
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		for (Customer _customer : customers) {
			if(_customer.getId() == customer.getId()) {
				customers.remove(_customer);
			}
		}
		
	}

	@Override
	public Customer get(int id) {
		for (Customer customer : customers) {
			if(customer.getId()==id) {}
			return customer;
		}
			return null;
	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

}
