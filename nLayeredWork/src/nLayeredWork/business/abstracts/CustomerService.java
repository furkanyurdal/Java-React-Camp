package nLayeredWork.business.abstracts;

import nLayeredWork.entities.concretes.Customer;

public interface CustomerService {
	void register(Customer customer);
	void login(String mail, String password);
}
