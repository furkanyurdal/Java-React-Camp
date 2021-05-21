package nLayeredWork;

import nLayeredWork.business.abstracts.CustomerService;
import nLayeredWork.business.concretes.CustomerCheckManager;
import nLayeredWork.business.concretes.CustomerManager;
import nLayeredWork.core.concretes.GoogleManagerAdapter;
import nLayeredWork.dataAccess.concretes.HibernateCustomerDao;
import nLayeredWork.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new CustomerCheckManager(), new HibernateCustomerDao(), new GoogleManagerAdapter());
		Customer customer = new Customer(1, "Furkan", "Yurdal", "f.yurdal@hotmail.com", "********");
		customerService.register(customer);
		customerService.login("f.yurdal@hotmail.com", "********");
	}

}
