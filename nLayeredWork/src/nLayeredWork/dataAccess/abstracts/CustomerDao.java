package nLayeredWork.dataAccess.abstracts;

import java.util.List;

import nLayeredWork.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer get(int id);
	List<Customer> getAll();
}
