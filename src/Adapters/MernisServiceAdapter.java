package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomerCheckService {
	
	
public boolean CheckIfRealPerson(Customer customer) {
	
	KPSPublicSoapProxy  client = new KPSPublicSoapProxy();
	
	
	try {
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(),customer.getDateOfBirth().getYear() );
	
	} catch (Exception e) {
		
		return false;
	}
		
		
}
}
