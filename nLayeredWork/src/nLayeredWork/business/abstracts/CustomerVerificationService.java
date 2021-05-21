package nLayeredWork.business.abstracts;

import nLayeredWork.entities.concretes.Customer;

public interface CustomerVerificationService {
	void verificationLink(String mail);
	boolean verificationLinkIsItClicked(Customer customer);
}
