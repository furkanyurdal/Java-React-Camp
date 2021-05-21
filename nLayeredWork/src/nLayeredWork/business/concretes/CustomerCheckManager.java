package nLayeredWork.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredWork.business.abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean passwordCheck(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			return false;
		}
			
	}

	@Override
	public boolean mailCheck(String mail) {
		String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Girdigin e posta gecersiz. Lütfen gecerli mail adresi giriniz " + mail);
            return false;
           }
		
	}

	@Override
	public boolean nameCheck(String name) {
		if(name.length()>=2) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
