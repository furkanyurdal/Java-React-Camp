package nLayeredWork.business.concretes;

import nLayeredWork.business.abstracts.CustomerCheckService;
import nLayeredWork.business.abstracts.CustomerService;
import nLayeredWork.business.abstracts.CustomerValidationService;
import nLayeredWork.core.abstracts.LoginService;
import nLayeredWork.dataAccess.abstracts.CustomerDao;
import nLayeredWork.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	private LoginService loginService;
	
	public CustomerManager(CustomerCheckService customerCheckService, CustomerDao customerDao, LoginService loginService) {
		super();
		this.customerCheckService = customerCheckService;
		this.customerDao = customerDao;
		this.loginService = loginService;
	}

	@Override
	public void register(Customer customer) {
		CustomerValidationService customerValidationService = new CustomerValidationManager(customerDao);
		
		if		(
				customerCheckService.nameCheck(customer.getFirstName()) 
				&&
				customerCheckService.nameCheck(customer.getLastName())
				&&
				customerCheckService.mailCheck(customer.getMail())
				&&
				customerCheckService.passwordCheck(customer.getPassword())
				&&
				customerValidationService.isItUsed(customer.getMail())
				)
				
				{
					customerDao.add(customer);
					loginService.login();
					
			
				}
	}

	@Override
	public void login(String mail, String password) {
		for (Customer customer : customerDao.getAll()) {
			if(mail == customer.getMail() && password == customer.getPassword()) {
				System.out.println("Basariyla giris yapildi.");
			}else {
				System.out.println("Mail veya sifre yanlis.");
			}
		}
		
	}

}
