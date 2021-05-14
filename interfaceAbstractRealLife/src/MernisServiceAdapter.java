import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;
public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try{return proxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
			}catch(NumberFormatException | RemoteException e) {e.printStackTrace();}		
			return false;
	}
			
 	}

