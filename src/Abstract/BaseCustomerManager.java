package Abstract;
import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {
	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() +"adl� m��teri Starbucks'a kaydedildi.");
	}
	

}
