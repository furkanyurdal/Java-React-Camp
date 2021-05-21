package nLayeredWork.business.abstracts;

public interface CustomerCheckService {
	boolean passwordCheck(String password);
	boolean mailCheck(String mail);
	boolean nameCheck(String name);
	
}
