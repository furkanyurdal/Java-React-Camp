package nLayeredWork.core.concretes;

import nLayeredWork.core.abstracts.LoginService;
import nLayeredWork.google.GoogleManager;

public class GoogleManagerAdapter implements LoginService{
	
	@Override
	public void login() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.login();
		
	}

}
