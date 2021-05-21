package nLayeredWork.business.concretes;

import nLayeredWork.business.abstracts.CustomerVerificationService;
import nLayeredWork.entities.concretes.Customer;

public class CustomerVerificationManager implements CustomerVerificationService{

	@Override
	public void verificationLink(String mail) {
		System.out.println("Dogrulama linki e postaya gonderildi " + mail);
		
	}

	@Override
	public boolean verificationLinkIsItClicked(Customer customer) {
		if(customer.isActive()) {
				return true;
			}else {
				return false;
			}
		
	}

}
