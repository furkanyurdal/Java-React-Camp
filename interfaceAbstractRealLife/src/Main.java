import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws RemoteException {

        Customer engin = new Customer(1,"Engin","Demiroð",LocalDate.of(1985, 1, 6),"28861499108");
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        try
        { 
            customerManager.save(engin);
            }
        catch (Exception e)
        {

        }

    }

}