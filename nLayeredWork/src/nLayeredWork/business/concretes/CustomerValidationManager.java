package nLayeredWork.business.concretes;

import nLayeredWork.business.abstracts.CustomerValidationService;
import nLayeredWork.dataAccess.abstracts.CustomerDao;
import nLayeredWork.entities.concretes.Customer;

public class CustomerValidationManager implements CustomerValidationService{
	
	private CustomerDao customerDao;	
	
	
	public CustomerValidationManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}


	@Override
	public boolean isItUsed(String mail) {
		for (Customer customer : customerDao.getAll()) {
			if(mail==customer.getMail()) {
				System.out.println("Bu mail kullaniliyor. Lutfen farkli bir mail adresi giriniz.");
				return false;
			}
		}
				return true;
	}

}
