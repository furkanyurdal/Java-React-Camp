package gameSimulation.Abstract;

import gameSimulation.Entities.Customer;

public interface CustomerService {
		
		void save(Customer customer);
		void update(Customer customer);
		void delete(Customer customer);

}
